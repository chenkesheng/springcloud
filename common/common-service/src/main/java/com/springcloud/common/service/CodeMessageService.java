package com.springcloud.common.service;


import com.springcloud.common.api.ICodeMessageService;
import com.springcloud.core.entity.CodeMessage;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 错误码对应的消息工具类
 *
 * @author cks
 * @Date 2017/7/21.
 */
@RestController
public class CodeMessageService implements ICodeMessageService {


    /**
     * 新增错误码
     *
     * @param codeMessage
     */
//    public void insertCodeMessage(CodeMessage codeMessage) {
//        codeMessage.setStatus(CodeMessage.STATUS_OPEN);
//        codeMessage.setCreateTime(new Date());
////        codeMessageMapper.insert(codeMessage);
//    }

    public CodeMessage findByKey(@RequestParam("key") Integer key) {
        CodeMessage codeMessage = new CodeMessage(1);
        codeMessage.setKey(1);
        codeMessage.setMsg("Mask傻吊");
        codeMessage.setMemo("Mask傻吊");
        return codeMessage;
    }

//    public String formatWithoutSys(int code, Object... params) {
//        return null;
//    }

}
