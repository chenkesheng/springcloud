package com.cks.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: cks
 * @Date: Created by 下午2:00 2017/11/12
 * @Package: com.cks.eureka
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
//@EnableAuthorizationServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
