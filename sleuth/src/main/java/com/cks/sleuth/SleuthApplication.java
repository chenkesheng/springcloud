package com.cks.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @Author: cks
 * @Date: Created by 13:58 2018/9/19
 * @Package: com.cks.sleuth
 * @Description:链路追踪
 */
@SpringBootApplication
@EnableZipkinServer
public class SleuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthApplication.class,args);

    }
}
