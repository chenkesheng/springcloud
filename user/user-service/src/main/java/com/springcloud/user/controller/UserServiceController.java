package com.springcloud.user.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.core.entity.CodeMessage;
import com.springcloud.user.client.Client;
import com.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;


/**
 * @author cks
 * @Date 2017/7/19.
 */
@RestController
@RequestMapping("user")
public class UserServiceController {
    @Autowired
    private UserService userService;
    @Autowired
    private Client.CodeMessage codeMessageService;

    /**
     * 创建用户(注册)
     *
     * @param user
     */
//    @NotLogin
//    @RequestMapping(value = "add", method = RequestMethod.POST)
//    public void addUser(User user) {
//        userService.add(user);
//    }

    /**
     * 登录
     *
//     * @param username
//     * @param password
//     * @param request
     * @return
     */
//    @NotLogin
//    @RequestMapping(value = "login", method = RequestMethod.POST)
//    public Object[] login(@RequestParam("username") String username,
//                          @RequestParam("password") String password,
//                          HttpServletRequest request) {
//        return userService.login(username, password, request);
//    }
//    @NotLogin
//    @RequestMapping(value = "find", method = RequestMethod.GET)
//    public Page<CodeMessage> find(Page<CodeMessage>page){
//        return codeMessageService.findPage(page);
//    }
    @LoadBalanced
    @HystrixCommand(fallbackMethod = "helloFallback")
    @RequestMapping(value = "find-code-message", method = RequestMethod.GET)
    public CodeMessage findByKey(@RequestParam("key") Integer key){
//        return new CodeMessage(key,discovery)
        return codeMessageService.findByKey(key);
    }

    public CodeMessage helloFallback(@RequestParam("key") Integer key) {
        CodeMessage codeMessage = new CodeMessage();
        codeMessage.setId(key);
        codeMessage.setMsg("监控图");
        codeMessage.setMemo("监控图");
        return codeMessage;
    }
}
