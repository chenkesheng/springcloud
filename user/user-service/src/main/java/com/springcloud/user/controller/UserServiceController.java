package com.springcloud.user.controller;


import com.springcloud.common.api.ICodeMessageService;
import com.springcloud.core.entity.CodeMessage;
import com.springcloud.user.client.Client;
import com.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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
    @RequestMapping(value = "find-code-message", method = RequestMethod.GET)
    public CodeMessage findByKey(@RequestParam("key") Integer key){
        return codeMessageService.findByKey(key);
    }
}
