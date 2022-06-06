package com.platform.cloud.mbg.datasource.jta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;

/**
 * @Author SmallSand
 * @Date 2019/9/18  9:55
 */
@Configuration
public class JtaTransactionConfiguration {

    @Autowired
    private AtomikosJtaConfiguration jtaConfiguration;

    @Bean(name = "financeCore")
    public PlatformTransactionManager platformTransactionManager()  throws Throwable {
        return new JtaTransactionManager(jtaConfiguration.userTransaction(), jtaConfiguration.transactionManager());
    }
}
