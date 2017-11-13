package com.springcloud.user.client;

import com.springcloud.common.api.ICodeMessageService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author cks
 * @Date 2017/11/13.
 */
public interface Client {
    @FeignClient(value = "COMMON")
    interface CodeMessage extends ICodeMessageService{};
}
