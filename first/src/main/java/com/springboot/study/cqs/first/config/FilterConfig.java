package com.springboot.study.cqs.first.config;

import com.springboot.study.cqs.first.web.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Filter 配置类
 * 在之前使用Filter时都是在web.xml中配置Filter、Filter Mapping
 * 在Spring Boot中需要通过FilterRegistrationBean进行配置
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        // == filter-name
        filterRegistrationBean.setName("myFilter");
        // == filter-class
        filterRegistrationBean.setFilter(new MyFilter());
        // == init-param
        filterRegistrationBean.addInitParameter("paramName","paramValue");
        // == filter-mapping url-pattern
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
