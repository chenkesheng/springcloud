package com.cks.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cks
 * @Date: Created by 下午4:25 2017/11/23
 * @Package: com.cks.config.server
 * @Description:
 */
@EnableConfigServer
@SpringBootApplication
@RestController
public class StartConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(StartConfigServer.class, args);
    }
}
