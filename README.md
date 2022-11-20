## eureka

```
# 修改host
127.0.0.1 node01,node02,node03
```
<http://node01:8081/>  
<http://node02:8082/>  
<http://node03:8083/>  

## 服务提供与负载均衡调用 Eureka

1. eureka-server 启动服务注册中心
2. eureka-client-01, eureka-client-02 启动两个客户端，用于向注册中心提供服务
3. springboot-feign Feign服务调用方
4. springboot-ribbon Ribbon服务调用方

服务注册中心: <http://127.0.0.1:7397/>

服务提供方  
client-01: <http://localhost:8001/api/queryUserInfo?userId=Tom>  
client-02: <http://localhost:8002/api/queryUserInfo?userId=Jerry>

访问Feign服务调用方，每次刷新会看到负载均衡调用到不同端口服务：  
<http://localhost:9001/api/queryUserInfo?userId=Tony>

访问Ribbon服务调用方，每次刷新会看到负载均衡调用到不同端口服务：  
<http://localhost:9002/api/queryUserInfo?userId=Tony>

## Hystrix-dashboard
<http://localhost:8989/hystrix>

测试监控：  
1. hystrix-dashboard
2. eureka-server 启动服务注册中心
3. eureka-client-01, eureka-client-02 启动两个客户端，用于向注册中心提供服务
4. springboot-feign Feign服务调用方, springboot-ribbon Ribbon服务调用方
5. springcloud-turbine 监控信息汇总

在 <http://localhost:8989/hystrix> 入口处填写: `http://localhost:8080/turbine.stream`  
（也就是fegin调用接口）
点击【Monitor Stream】

刷新调用接口:   
<http://localhost:9001/api/queryUserInfo?userId=111>  
<http://localhost:9002/api/queryUserInfo?userId=222>
观察监控页面。过程中讲服务提供方关闭
