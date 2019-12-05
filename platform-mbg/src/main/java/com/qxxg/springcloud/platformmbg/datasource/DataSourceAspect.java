package com.qxxg.springcloud.platformmbg.datasource;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author:SmallSand
 * @Date:Created in 2019/8/21
 */
@Aspect
@Component
@Slf4j
public class DataSourceAspect implements PriorityOrdered {

    @Before("execution(* com.qxxg.springcloud.platformmbg.mapper..*.select*(..)) " +
            "|| execution(* com.qxxg.springcloud.platformmbg.mapper..*.get*(..)) " +
            "|| execution(* com.qxxg.springcloud.platformmbg.mapper..*.find*(..))")
    public void setReadDataSourceType() {
        DatabaseContextHolder.setRead();
        log.debug("dataSource切换到：Read");
    }


    @Before("execution(* com.qxxg.springcloud.platformmbg.mapper..*.insert*(..)) " +
            "|| execution(* com.qxxg.springcloud.platformmbg.mapper..*.update*(..)) " +
            "|| execution(* com.qxxg.springcloud.platformmbg.mapper..*.add*(..)) " +
            "|| execution(* com.qxxg.springcloud.platformmbg.mapper..*.delete*(..))")
    public void setWriteDataSourceType() {
        DatabaseContextHolder.setWrite();
        log.debug("dataSource切换到：write");
    }

    @Override
    public int getOrder() {
        /**
         * 值越小，越优先执行
         * 要优于事务的执行
         * 在启动类中加上了@EnableTransactionManagement(order = 10)
         */
        return 1;
    }
}
