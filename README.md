内部调用接口使用service定义  I开头的是接口 Client后缀 为feign-client 
当远程调用其他模块服务的时候定义feign-client 需要再client包下建立模块service  内部定义client服务继承service接口

启动需要的配置要配置在application.yml中 这个是第一个加载的


##目录说明
* common:基础模块 
* support: 支持模块、预留
* core:核心模块  
* doc:相关笔记、文档
* eureka:eureka注册中心
* user：用户模块 

#后期会扩展Ribbon负载均衡 GateWay Hystrix熔断器、网关我应该会用nginx zuul个人觉得很鸡肋。

*要启动我这项目记得在windows hosts 文件最下方加一个主机端口     **127.0.0.1 cks cks1**
*Mac和linux下的话 修改 etc/hosts 文件  添加这句  **127.0.0.1 cks cks1** 然后执行source /etc/hosts

- 千万别使用JDK9 本人被JDK9坑了  无法识别我们的配置文件。 导致Eureka无法正常启动。现在官方暂时没解决这个问题。建议等SpringBoot2.0出来之后在看
