package com.platform.cloud.sso.integration;

import com.platform.cloud.common.exception.Asserts;
import com.platform.cloud.sso.entity.UmsAdmin;
import com.platform.cloud.sso.entity.UmsResourceExample;
import com.platform.cloud.sso.integration.authenticator.IntegrationAuthenticator;
import com.platform.cloud.sso.mapper.UmsResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 集成认证-用户细节服务
 */
@Service
public class IntegrationUserDetailsService implements UserDetailsService {

    @Autowired
    private UmsResourceMapper umsResourceMapper;


    private List<IntegrationAuthenticator> authenticators;

    @Autowired(required = false)
    public void setIntegrationAuthenticators(List<IntegrationAuthenticator> authenticators) {
        this.authenticators = authenticators;
    }

    @Override
    public UserDetails loadUserByUsername(String str) throws UsernameNotFoundException {
        IntegrationAuthenticationEntity entity = IntegrationAuthenticationContext.get();
        if (entity == null){
            entity = new IntegrationAuthenticationEntity();
        }
        UmsAdmin pojo = this.authenticate(entity);
        if (pojo == null){
            Asserts.fail("密码错误,请重试");
        }
        List<SimpleGrantedAuthority> collect = umsResourceMapper.selectByUserId(pojo.getId()).stream()
                .map(role -> new SimpleGrantedAuthority(role.getId() + ":" + role.getUrl()))
                .collect(Collectors.toList());
        User user = new User(pojo.getUsername(),pojo.getPassword(),collect);
        return user;
    }

    private UmsAdmin authenticate(IntegrationAuthenticationEntity entity) {
        if (this.authenticators != null) {
            for (IntegrationAuthenticator authenticator : authenticators) {
                if (authenticator.support(entity)) {
                    return authenticator.authenticate(entity);
                }
            }
        }
        return null;
    }
}
