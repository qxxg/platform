package com.platform.cloud.mbg.datasource;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.mysql.cj.jdbc.MysqlXADataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:SmallSand
 * @Date:Created in 2019/8/21
 */
@PropertySource(value = "classpath:config.properties")
@Configuration
public class DataSourceConfig {

    @Value("${mysql.datasource.write.jdbc-url}")
    private String url;

    @Value("${mysql.datasource.write.username}")
    private String username;

    @Value("${mysql.datasource.write.password}")
    private String pwd;

    @Primary
    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix = "mysql.datasource.write")
    public DataSource  primaryDataSource() {
        //jta+atomikos分布式事务
        MysqlXADataSource mysqlXADataSource = new MysqlXADataSource();
        mysqlXADataSource.setUrl(url);
        mysqlXADataSource.setUser(username);
        mysqlXADataSource.setPassword(pwd);
        AtomikosDataSourceBean atomikosDataSource = new AtomikosDataSourceBean();
        atomikosDataSource.setUniqueResourceName("primaryDataSource");
        atomikosDataSource.setXaDataSource(mysqlXADataSource);
        atomikosDataSource.setMinPoolSize(20);
        atomikosDataSource.setMaxPoolSize(100);
        atomikosDataSource.setTestQuery("SELECT 1");
        return atomikosDataSource;
        //seata分布式事务
        //return new DataSourceProxy(DataSourceBuilder.create().build());
        //return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondaryDataSourceOne")
    @Qualifier("secondaryDataSourceOne")
    @ConfigurationProperties(prefix = "mysql.datasource.read01")
    public DataSource secondaryDataSourceOne() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondaryDataSourceTwo")
    @Qualifier("secondaryDataSourceTwo")
    @ConfigurationProperties(prefix = "mysql.datasource.read02")
    public DataSource secondaryDataSourceTwo() {
        return DataSourceBuilder.create().build();
    }


    @Bean("readDataSources")
    public List<DataSource> readDataSources() {
        List<DataSource> dataSources = new ArrayList<>();
        dataSources.add(secondaryDataSourceOne());
        dataSources.add(secondaryDataSourceTwo());
        return dataSources;
    }
}
