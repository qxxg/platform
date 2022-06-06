package com.platform.cloud.sso.config;

import com.platform.cloud.common.exception.ApiException;
import com.platform.cloud.sso.integration.IntegrationUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;

import java.security.KeyPair;

/**
 * @Description: 授权服务器配置
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfigurer extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private IntegrationUserDetailsService integrationUserDetailsService;

    //这里true，使全局密码结果为true，因为有些登录类型不需要验证密码，比如验证码登录，第三方系统登录等等，所以需要认证密码的要单独认证
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return "";
            }
            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return true;
            }
        };
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(tokenStore())
                .accessTokenConverter(jwtAccessTokenConverter())
                .authenticationManager(authenticationManager )
                .userDetailsService(integrationUserDetailsService)
                .exceptionTranslator(new MyWebResponseExceptionTranslator());
        super.configure(endpoints);
    }

    public TokenStore tokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    /**
     * keytool -genkeypair -alias ltd-jwt -validity 3650 -keyalg RSA -dname "CN=jwt,OU=jwt,L=zurich,C=CH" -keypass ltd123 -keystore ltd-jwt.jks -storepass ltd123
     * @return
     */
    public JwtAccessTokenConverter jwtAccessTokenConverter(){
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
        ClassPathResource resource = new ClassPathResource("ltd-jwt.jks");
        KeyStoreKeyFactory ksf = new KeyStoreKeyFactory(resource,"ltd123".toCharArray());
        KeyPair kp = ksf.getKeyPair("ltd-jwt");
        jwtAccessTokenConverter.setKeyPair(kp);
        return jwtAccessTokenConverter;
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.allowFormAuthenticationForClients()
               // .tokenKeyAccess("isAuthenticated()")
                .checkTokenAccess("permitAll()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("web")
                .secret("web-secret")
                .accessTokenValiditySeconds(-1)
                .authorizedGrantTypes("password").scopes("web")
                .and()
                .withClient("andorid")
                .secret("andorid-secret")
                .accessTokenValiditySeconds(-1)
                .authorizedGrantTypes("password").scopes("adnorid");
        super.configure(clients);
    }
}
