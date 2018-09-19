package com.cks.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: cks
 * @Date: Created by 10:23 2018/9/19
 * @Package: com.cks.config.client
 * @Description:统一配置中心客户端
 */
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
