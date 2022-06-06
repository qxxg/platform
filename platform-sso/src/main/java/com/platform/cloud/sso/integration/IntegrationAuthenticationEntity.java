package com.platform.cloud.sso.integration;

import lombok.Data;

import java.util.Map;

/**
 * @Description: 集成认证实体
 */

@Data
public class IntegrationAuthenticationEntity {
    private String authType;//请求登录认证类型
    private Map<String,String[]> authParameters;//请求登录认证参数集合

    public String getAuthParameter(String paramter){
        String[] values = this.authParameters.get(paramter);
        if(values != null && values.length > 0){
            return values[0];
        }
        return null;
    }
}
