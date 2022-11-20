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
