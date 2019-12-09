# platform


## 项目介绍

`platform`是一套微服务组件集成测试练习项目，采用了eureka注册中心、spring gateway网关、oauth2.0安全验证、springboot-admin服务监控、openfeign远程调用、zipkin+Sleuth分布式链路追踪、jta-atomikos分布式事务处理（后期会改成阿里分布式事务seata）等


## 组织结构

``` lua
platform
├── platform-common -- 工具类及通用代码模块
├── platform-mbg -- MyBatisGenerator生成的数据库操作代码模块
├── platform-eureka -- 注册中心
├── platform-admin-- springboot监控
├── platform-gateway-- spring网关
├── platform-user（log） -- 测试feign、分布式事务模块
└── platform-oauth2-- oauth验证服务
```
