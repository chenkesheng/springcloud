package com.springcloud.common.api;


import com.springcloud.core.entity.CodeMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author cks
 * @Date 2017/7/21.
 */
@RequestMapping("/code/message")
public interface ICodeMessageService {
    /**
     * 将错误编号对应的消息使用params进行格式化。
     * 具体规则为：我有{}只小毛驴，我重来也不{}.这里拓展参数可以使用{1, "打"}。
     * 具体类似SLF4J打印日志的形式
     *
     * @param code   错误编号
     * @param params 参数
     * @return 格式化后的提示
     */
//    String formatWithoutSys(int code, Object... params);

    /**
     * 错误码列表
     *
     * @param page
     * @return
     */
//    Page<CodeMessage> findPage(Page<CodeMessage> page);

    /**
     * 新增错误码
     *
     * @param codeMessage
     */
//    void insertCodeMessage(CodeMessage codeMessage);

    /**
     * 通过key来查找错误码
     *
     * @param key
     * @return
     */
    @RequestMapping(value = "find-key", method = RequestMethod.GET)
    CodeMessage findByKey(@RequestParam("key") Integer key);

}
