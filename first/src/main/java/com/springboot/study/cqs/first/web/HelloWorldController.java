package com.springboot.study.cqs.first.web;

import com.springboot.study.cqs.first.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cqs
 *
 */
@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    public String sayHelloWorld(String param) {
        String result = "Hello Spring Boot World";
        return StringUtils.isEmpty(param) ? result : result + param;
    }

    /**
     * spring boot 对对象 json的支持
     * @return
     */
    @RequestMapping("getUser")
    public User getUser(){
        User user = new User();
        user.setUserName("cqs");
        user.setPassWord("123456");
        return user;
    }
}
