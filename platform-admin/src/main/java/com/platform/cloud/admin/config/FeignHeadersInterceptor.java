package com.platform.cloud.admin.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * fenin拦截器：在fengin调用时在header中添加oauth2.0的token信息
 *
 * @Author: smallsand
 * @Date: 2019/11/22 10:52
 */
@Component
public class FeignHeadersInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {

        HttpServletRequest request = getHttpServletRequest();

        if (Objects.isNull(request)) {
            return;
        }

        Map<String, String> headers = getHeaders(request);
        if (headers.size() > 0) {
            template.header("authorization", headers.get("authorization"));
          /*  Iterator<Entry<String, String>> iterator = headers.entrySet().iterator();
            while (iterator.hasNext()) {
                Entry<String, String> entry = iterator.next();
                // 把请求过来的header请求头 原样设置到feign请求头中
                // 包括token
                template.header(entry.getKey(), entry.getValue());
            }*/
        }
    }

    private HttpServletRequest getHttpServletRequest() {

        try {
            // 这种方式获取的HttpServletRequest是线程安全的
            return ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
        } catch (Exception e) {

            return null;
        }
    }

    private Map<String, String> getHeaders(HttpServletRequest request) {

        Map<String, String> map = new LinkedHashMap<>();

        Enumeration<String> enums = request.getHeaderNames();
        while (enums.hasMoreElements()) {
            String key = enums.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }

        return map;
    }
}