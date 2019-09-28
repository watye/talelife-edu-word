package com.talelife.edu.word.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.talelife.edu.word.dao")
@EnableSwagger2
@ComponentScan(basePackages = {
		"com.talelife.framework.handler",
		"com.talelife.framework.interceptor",
		"com.talelife.edu.word"
		})
public class EduWordWebApplication {

	public static void main(String[] args) {
       SpringApplication.run(EduWordWebApplication.class, args);
  }


}