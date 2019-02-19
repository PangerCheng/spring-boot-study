package com.springboot.study.cqs.spirngboothellojpa.web;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("获取MyFilter初始化参数:paramName = " + filterConfig.getInitParameter("paramName"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        String filterUri = "saveUser";
        RequestDispatcher dispatcher = null;
        if (uri.indexOf(filterUri) > 0) {
            dispatcher = request.getRequestDispatcher("/getUser");
        } else {
            dispatcher = request.getRequestDispatcher("/hello?param= my filter had done!");
        }
        dispatcher.forward(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
