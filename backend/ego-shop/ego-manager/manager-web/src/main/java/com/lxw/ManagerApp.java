package com.lxw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.lxw.mapper")
@EnableSwagger2
public class ManagerApp {
	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ManagerApp.class, args);
	}

}
