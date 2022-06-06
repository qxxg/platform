package com.platform.cloud.sso.integration.authenticator;

import com.platform.cloud.sso.integration.IntegrationAuthenticationEntity;

/**
 * @Description: 集成认证-认证器抽象类
 */
public abstract class AbstractPreparableIntegrationAuthenticator implements IntegrationAuthenticator {

    @Override
    public void prepare(IntegrationAuthenticationEntity entity) {

    }

    @Override
    public void complete(IntegrationAuthenticationEntity entity) {

    }
}
