package com.qxxg.springcloud.platformoauth2.integration.authenticator;

import com.qxxg.springcloud.platformoauth2.entity.UserPojo;
import com.qxxg.springcloud.platformoauth2.integration.IntegrationAuthenticationEntity;
import com.qxxg.springcloud.platformoauth2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @Description: 普通认证器（用户名+密码）
 */
@Component
@Primary
public class UsernamePasswordAuthenticator extends AbstractPreparableIntegrationAuthenticator {

    @Autowired
    private UserMapper mapper;

    @Override
    public UserPojo authenticate(IntegrationAuthenticationEntity entity) {
        String name = entity.getAuthParameter("username");
        String pwd = entity.getAuthParameter("password");
        if(name == null || pwd == null){
            throw new OAuth2Exception("用户名或密码不能为空");
        }
        UserPojo pojo = mapper.findByName(name);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder != null && encoder.matches(pwd,pojo.getPwd())){
            return pojo;
        }
        return null;
    }

    @Override
    public boolean support(IntegrationAuthenticationEntity entity) {
        return StringUtils.isEmpty(entity.getAuthType());
    }
}
