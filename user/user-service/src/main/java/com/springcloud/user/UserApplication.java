package com.springcloud.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: cks
 * @Date: Created by 15:01 2017/11/12
 * @Package: com.springcloud.user
 * @Description:
 */
//启用单点登陆
//@EnableOAuth2Sso
//注册中心
@EnableEurekaClient
//声明调用
@EnableFeignClients
//springCloud启动
@SpringBootApplication
//熔断器
@EnableCircuitBreaker
@EnableHystrixDashboard
//@SpringCloudApplication 一个顶好几个
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
