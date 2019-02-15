package com.springboot.study.cqs.first.web;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
public class HelloWorldControllerTest {
    /**
     * Spring的测试工具类
     */
    private MockMvc mockMvc;

    @Before
    public void setMockMvc() {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }

    @Test
    public void testSayHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/hello?param=cqs").accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
    }

    /**
     * Springboot自动将对象转换为json
     * @throws Exception
     */
    @Test
    public void testGetUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/getUser")).andDo(print());
    }
}
