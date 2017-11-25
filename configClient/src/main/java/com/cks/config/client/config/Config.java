package com.cks.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cks
 * @Date: Created by 上午9:42 2017/11/25
 * @Package: com.cks.config.client.config
 * @Description:
 */
@ConfigurationProperties
@RestController
@RefreshScope
public class Config {
//    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
