package com.qxxg.springcloud.platformmbg.aspect;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import cn.hutool.json.JSONUtil;
import com.qxxg.springcloud.platformmbg.entity.WebLogAop;
import com.qxxg.springcloud.platformmbg.service.WebLogAopService;
import com.qxxg.springcloud.platformmbg.util.IpUtil;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.logstash.logback.marker.Markers;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 统一日志处理切面
 * Created by macro on 2018/4/26.
 */
@Slf4j
@Aspect
@Component
@Order(1)
public class WebLogAspect {
    //private static final Logger LOGGER = LoggerFactory.getLogger(WebLogAspect.class);
    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Resource
    private WebLogAopService webLogAopServiceImpl;

    @Pointcut("execution(public * com.qxxg.springcloud.*.controller.*.*(..))")
    public void webLog() {
    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
    }

    @AfterReturning(value = "webLog()", returning = "ret")
    public void doAfterReturning(Object ret) throws Throwable {
    }

    @Around("webLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        //获取当前请求对象
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Principal userPrincipal = request.getUserPrincipal();
        WebLogAop wla = new WebLogAop();
        wla.setUsername(userPrincipal.getName());
        Object result = joinPoint.proceed();
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        if (method.isAnnotationPresent(ApiOperation.class)) {
            ApiOperation log = method.getAnnotation(ApiOperation.class);
            wla.setDescription(log.value());
        }
        long endTime = System.currentTimeMillis();
        String urlStr = request.getRequestURL().toString();
        wla.setBasePath(StrUtil.removeSuffix(urlStr, URLUtil.url(urlStr).getPath()));
        wla.setIp(IpUtil.getIpAddr(request));
        wla.setMethod(request.getMethod());
        wla.setParameter( JSONUtil.toJsonStr(getParameter(method, joinPoint.getArgs())));
        wla.setResult( JSONUtil.toJsonStr(result));
        wla.setSpendTime((int) (endTime - startTime.get()));
        wla.setStartTime(startTime.get());
        wla.setUri(request.getRequestURI());
        wla.setUrl(request.getRequestURL().toString());
        System.out.println("记录数据开始》》》》》》》》》》》");
        //ThreadPoolUtil.getPool().execute(new SaveWebLogAop(webLogAopServiceImpl,wla));
        log.info(JSONUtil.parse(wla).toString());
        return result;
    }

    /**
     * 根据方法和传入的参数获取请求参数
     */
    private Object getParameter(Method method, Object[] args) {
        List<Object> argList = new ArrayList<>();
        Parameter[] parameters = method.getParameters();
        for (int i = 0; i < parameters.length; i++) {
            RequestBody requestBody = parameters[i].getAnnotation(RequestBody.class);
            if (requestBody != null) {
                argList.add(args[i]);
            }
            RequestParam requestParam = parameters[i].getAnnotation(RequestParam.class);
            if (requestParam != null) {
                Map<String, Object> map = new HashMap<>();
                String key = parameters[i].getName();
                if (!StringUtils.isEmpty(requestParam.value())) {
                    key = requestParam.value();
                }
                map.put(key, args[i]);
                argList.add(map);
            }
        }
        if (argList.size() == 0) {
            return null;
        } else if (argList.size() == 1) {
            return argList.get(0);
        } else {
            return argList;
        }
    }


    /**
     * 日志保存
     */
    private static class SaveWebLogAop implements Runnable{

        private WebLogAopService webLogAopServiceImpl;

        private WebLogAop wla;

        public SaveWebLogAop(WebLogAopService webLogAopServiceImpl,WebLogAop wla){
            this.webLogAopServiceImpl=webLogAopServiceImpl;
            this.wla = wla;
        }

        @Override
        public void run() {
            webLogAopServiceImpl.saveWebLogAop(wla);
        }
    }

}

