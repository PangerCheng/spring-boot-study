package com.springboot.study.cqs.springbootthymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/layout-hello")
    public String index(ModelMap map) {
        map.addAttribute("description","layout-hello");
        return "layout-thymeleaf";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

}