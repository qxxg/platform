package com.qxxg.springcloud.platformoauth2.integration;

import com.qxxg.springcloud.platformoauth2.entity.UserPojo;
import com.qxxg.springcloud.platformoauth2.integration.authenticator.IntegrationAuthenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 集成认证-用户细节服务
 */
@Service
public class IntegrationUserDetailsService implements UserDetailsService {

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
        UserPojo pojo = this.authenticate(entity);
        if (pojo == null){
            throw new OAuth2Exception("用户名或密码错误");
        }
        User user = new User(pojo.getName(),pojo.getPwd(), AuthorityUtils.commaSeparatedStringToAuthorityList("ROOT_USER"));
        return user;
    }

    private UserPojo authenticate(IntegrationAuthenticationEntity entity) {
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
