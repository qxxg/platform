package com.platform.cloud.sso.integration.authenticator;

import com.platform.cloud.sso.entity.UmsAdmin;
import com.platform.cloud.sso.entity.UmsAdminExample;
import com.platform.cloud.sso.integration.IntegrationAuthenticationEntity;
import com.platform.cloud.sso.mapper.UmsAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Description: 短信认证器
 */
@Component
public class SmsAuthenticator extends AbstractPreparableIntegrationAuthenticator {

    private final static String AUTH_TYPE = "sms";
    @Autowired
    private UmsAdminMapper mapper;

    @Override
    public UmsAdmin authenticate(IntegrationAuthenticationEntity entity) {
        String mobile = entity.getAuthParameter("mobile");
        if(StringUtils.isEmpty(mobile)){
            throw new OAuth2Exception("手机号不能为空");
        }
        String code = entity.getAuthParameter("code");
        //测试项目，所以将验证码顶死为：1234
        if(! "1234".equals(code)){
            throw new OAuth2Exception("验证码错误或已过期");
        }
        UmsAdminExample uae = new UmsAdminExample();
        uae.createCriteria().andUsernameEqualTo(mobile);
        List<UmsAdmin> umsAdmins = mapper.selectByExample(uae);
        if(CollectionUtils.isEmpty(umsAdmins)){
            throw new OAuth2Exception("手机号输入错误，请重试");
        }
        return umsAdmins.get(0);
    }

    @Override
    public boolean support(IntegrationAuthenticationEntity entity) {
        return AUTH_TYPE.equals(entity.getAuthType());
    }
}
