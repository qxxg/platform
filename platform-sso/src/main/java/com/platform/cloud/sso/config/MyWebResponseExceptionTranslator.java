package com.platform.cloud.sso.config;

import com.platform.cloud.common.api.CommonResult;
import com.platform.cloud.common.exception.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;

/**
 * @Description: TODO
 * @author: WangYong
 * @date: 2022-06-05
 */
public class MyWebResponseExceptionTranslator implements WebResponseExceptionTranslator {
    @Override
    public ResponseEntity<CommonResult> translate(Exception exception) throws Exception {
        if (exception instanceof OAuth2Exception) {
            OAuth2Exception oAuth2Exception = (OAuth2Exception) exception;
            return ResponseEntity
                    .status(oAuth2Exception.getHttpErrorCode())
                    .body(CommonResult.failed(oAuth2Exception.getMessage()));
        }else if(exception instanceof AuthenticationException){
            AuthenticationException authenticationException = (AuthenticationException) exception;
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body(CommonResult.failed(authenticationException.getMessage()));
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(CommonResult.failed(exception.getMessage()));
    }
}

