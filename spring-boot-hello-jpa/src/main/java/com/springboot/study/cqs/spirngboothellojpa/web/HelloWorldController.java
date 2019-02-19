package com.springboot.study.cqs.spirngboothellojpa.web;

import com.springboot.study.cqs.spirngboothellojpa.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author cqs
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
     *
     * @return
     */
    @RequestMapping("getUser")
    public User getUser() {
        User user = new User();
        user.setUserName("cqs");
        user.setPassWord("123456");
        return user;
    }

    /**
     * 参数验证
     */
    @RequestMapping("saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        System.out.println("user:" + user);
        if (result.hasErrors()) {
            /**
             * 显示校验关键字的异常信息，但获取不了对象属性字段
             */
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError error : errors) {
                System.out.println("校验Code：" + error.getCode() + " 异常：" + error.getDefaultMessage());
            }

            /**
             * 显示对象属性字段的异常信息
             */
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError error : fieldErrors) {
                System.out.println("字段：" + error.getField() + " 异常：" + error.getDefaultMessage());
            }
        }
    }
}
