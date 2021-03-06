package com.cks.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @Author: cks
 * @Date: Created by 下午5:35 2017/11/19
 * @Package: com.cks.hystrix
 * @Description:
 */
@SpringBootApplication
//开启注册中心
@EnableEurekaClient
//开启熔断器
@EnableCircuitBreaker
//启用Hystrix Dashboard功能
@EnableHystrixDashboard
@EnableTurbine
public class HystrixApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixApplication.class).web(true).run(args);
    }
}
