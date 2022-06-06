package com.platform.cloud.sso.integration;

/**
 * @Description: 集成认证上下文
 */

public class IntegrationAuthenticationContext {
    private static ThreadLocal<IntegrationAuthenticationEntity> holder = new ThreadLocal<>();

    public static void set(IntegrationAuthenticationEntity entity){
        holder.set(entity);
    }

    public static IntegrationAuthenticationEntity get(){
        return holder.get();
    }

    public static void clear(){
        holder.remove();
    }
}
