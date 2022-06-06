# 简介
微服务Oauth2.0授权中心整合案例<br/>
分布式事务整合案例<br/>
后台动态根据分配权限自动控制接口访问权限具体参考IntegrationUserDetailsService.loadUserByUsername、platfrom-admin中DynamicSecurityMetadataSource、DynamicAccessDecisionManager</br>
运行项目导入sql文件<br/>
# 目录结构
platform-sso: Oauth2.0授权中心<br/>
        Post请求：localhost:12315/oauth/token?grant_type=password&username=macro&password=macro123&client_id=web&client_secret=web-secret&scope=web
![img.png](img.png)<br/>
    platform-admin: 后台管理服务<br/>
![img_1.png](img_1.png)<br/>

     platform-common: 公共服务封装<br/>
     platform-mbg: mybatis逆向工程<br/>
SQL文件：doc/platform.sql<br/>
     数据库配置：platform-mbg<br/>
        config.properties多数据源配置文件<br/>
        generator.properties  mybatis逆向工程数据库配置文件