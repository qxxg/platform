package com.qxxg.springcloud.platformgateway.filter;

import com.qxxg.springcloud.platformgateway.util.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 * 登录时把jwt放入redis。退出时删除此jwt
 * @Author: smallsand
 * @Date: 2019/11/23 11:33
 */
@Slf4j
public class TokenFilter implements GlobalFilter, Ordered {

    @Autowired
    private RedisTemplate redisTemplate;

    private static final String LOGIN_PATH = "/oauth-service/oauth/token";
    private static final String BEARER = "Bearer ";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        //获取header里面的Authorization用户oauth2的安全验证
        List<String> authorization = request.getHeaders().get("Authorization");
        //获取当前请求路径
        String path = request.getPath().toString();
        //登录请求处理
        if (LOGIN_PATH.equals(path)) {
            ServerHttpResponse originalResponse = exchange.getResponse();
            DataBufferFactory bufferFactory = originalResponse.bufferFactory();
            StringBuffer sb = new StringBuffer();
            ServerHttpResponseDecorator decoratedResponse = new ServerHttpResponseDecorator(originalResponse) {
                @Override
                public Mono<Void> writeWith(Publisher<? extends DataBuffer> body) {
                    if (body instanceof Flux) {
                        Flux<? extends DataBuffer> fluxBody = (Flux<? extends DataBuffer>) body;
                        return super.writeWith(fluxBody.map(dataBuffer -> {
                            byte[] content = new byte[dataBuffer.readableByteCount()];
                            dataBuffer.read(content);
                            //释放掉内存
                            DataBufferUtils.release(dataBuffer);
                            String ss = new String(content, Charset.forName("UTF-8"));
                            sb.append(ss);
                            try {
                                GsonJsonParser gjp = new GsonJsonParser();
                                Map<String, Object> stringObjectMap = gjp.parseMap(sb.toString());

                                String access_token = BEARER + stringObjectMap.get("access_token");
                                String md5 = MD5Util.getMD5(access_token);
                                redisTemplate.opsForValue().set(md5, access_token);
                            } catch (Exception e) {
                            }
                            byte[] uppedContent = new String(content, Charset.forName("UTF-8")).getBytes();
                            return bufferFactory.wrap(uppedContent);
                        }));
                    }
                    return super.writeWith(body);
                }
            };
            return chain.filter(exchange.mutate().response(decoratedResponse).build());
        }

        //如果携带的Authorization为空，直接放行
        if(CollectionUtils.isEmpty(authorization))
            return chain.filter(exchange);
        //如果redis中没有这条Authorization的信息返回登录失败
        if (StringUtils.isEmpty(redisTemplate.opsForValue().get(MD5Util.getMD5(authorization.get(0))))) {
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            byte[] bytes = "{\"status\":\"401\",\"msg\":\"没有登录、或登录已失效。请从新登录\"}".getBytes(StandardCharsets.UTF_8);
            DataBuffer buffer = exchange.getResponse().bufferFactory().wrap(bytes);
            return exchange.getResponse().writeWith(Flux.just(buffer));
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -100;
    }

}
