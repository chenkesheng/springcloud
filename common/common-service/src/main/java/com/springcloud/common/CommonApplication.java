package com.springcloud.common;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: cks
 * @Date: Created by 15:03 2017/11/12
 * @Package: com.springcloud.common
 * @Description:
 */
//启用单点登陆
//@EnableOAuth2Sso
//向eureka注册自己作为一个服务的调用client
 @EnableDiscoveryClient
//注册中心 代表的是向eureka注册自己，将自己作为一个服务
//@EnableEurekaClient
//声明调用
@EnableFeignClients
//springCloud启动
@SpringBootApplication
//熔断器
@EnableCircuitBreaker
@EnableHystrixDashboard
//实时刷新
@RefreshScope
public class CommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }
}
