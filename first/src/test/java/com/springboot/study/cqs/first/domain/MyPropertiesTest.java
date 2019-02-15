package com.springboot.study.cqs.first.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyPropertiesTest {
    @Resource
    private MyProperties myProperties;

    @Test
    public void testProperty() {
        System.out.println(myProperties.getClass().getSimpleName() + "-->title =" + myProperties.getTitle() + ",description = " + myProperties.getDescription());
    }
}
