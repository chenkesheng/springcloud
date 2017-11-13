package com.springcloud.common;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: cks
 * @Date: Created by 15:03 2017/11/12
 * @Package: com.springcloud.common
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class CommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }
}
