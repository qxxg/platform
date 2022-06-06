package com.platform.cloud.sso.integration.authenticator;

import com.platform.cloud.common.exception.Asserts;
import com.platform.cloud.sso.entity.UmsAdmin;
import com.platform.cloud.sso.entity.UmsAdminExample;
import com.platform.cloud.sso.integration.IntegrationAuthenticationEntity;
import com.platform.cloud.sso.mapper.UmsAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Description: 普通认证器（用户名+密码）
 */
@Component
@Primary
public class UsernamePasswordAuthenticator extends AbstractPreparableIntegrationAuthenticator {

    @Autowired
    private UmsAdminMapper mapper;

    @Override
    public UmsAdmin authenticate(IntegrationAuthenticationEntity entity) {
        String name = entity.getAuthParameter("username");
        String pwd = entity.getAuthParameter("password");
        if(name == null || pwd == null){
            Asserts.fail("用户名或密码不能为空");
        }
        UmsAdminExample uae = new UmsAdminExample();
        uae.createCriteria().andUsernameEqualTo(name);
        List<UmsAdmin> umsAdmins = mapper.selectByExample(uae);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(CollectionUtils.isEmpty(umsAdmins)){
            Asserts.fail("账号输入错误，请重试");
        }
        if(encoder != null && encoder.matches(pwd,umsAdmins.get(0).getPassword())){
            return umsAdmins.get(0);
        }
        return null;
    }

    @Override
    public boolean support(IntegrationAuthenticationEntity entity) {
        return StringUtils.isEmpty(entity.getAuthType());
    }
}
