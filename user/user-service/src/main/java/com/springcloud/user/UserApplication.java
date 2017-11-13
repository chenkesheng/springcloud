package com.springcloud.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: cks
 * @Date: Created by 15:01 2017/11/12
 * @Package: com.springcloud.user
 * @Description:
 */
//注册中心
@EnableEurekaClient
//声明调用
@EnableFeignClients
//springCloud启动
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
