package com.platform.cloud.mbg.datasource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:SmallSand
 * @Date:Created in 2019/8/21
 */
@PropertySource(value = "classpath:config.properties")
@Configuration
@ConditionalOnClass({EnableTransactionManagement.class})
@Import({DataSourceConfig.class})
public class SqlSessionFactoryConfiguration {

    @Resource(name = "primaryDataSource")
    private DataSource  dataSource;


    @Resource(name = "readDataSources")
    private List<DataSource> readDataSources;

    @Value("${mysql.datasource.size}")
    private String dataSourceSize;

    @Bean
    @ConditionalOnMissingBean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean  sqlSessionFactoryBean = new SqlSessionFactoryBean ();
        sqlSessionFactoryBean.setDataSource(roundRobinDataSouceProxy());
        sqlSessionFactoryBean.setTypeAliasesPackage("com.platform.cloud.*.mapper");
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        sqlSessionFactoryBean.setConfigLocation(new DefaultResourceLoader().getResource("classpath:mybatis-config.xml"));
        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sqlSessionFactoryBean;
    }
    /**
     * 有多少个数据源就要配置多少个bean
     * @return
     */
    @Bean
    public AbstractRoutingDataSource roundRobinDataSouceProxy() {
        int size = Integer.valueOf(dataSourceSize);
        DynamicDataSource proxy = new DynamicDataSource(size);
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DatabaseType.write.getType(),dataSource);
        for (int i = 0; i < size; i++) {
            targetDataSources.put(i, readDataSources.get(i));
        }
        proxy.setDefaultTargetDataSource(dataSource);
        proxy.setTargetDataSources(targetDataSources);
        return proxy;
    }
}
