package com.springboot.study.cqs.springbootthymeleaf;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.TemplateEngine;

@SpringBootApplication
public class SpringBootThymeleafApplication {

	public static void main(String[] args) {
		/*要想使用layout还有加如下*/
		TemplateEngine templateEngine = new TemplateEngine();
		templateEngine.addDialect(new LayoutDialect());
		SpringApplication.run(SpringBootThymeleafApplication.class, args);
	}

}
