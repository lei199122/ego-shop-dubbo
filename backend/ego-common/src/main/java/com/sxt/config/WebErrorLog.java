package com.sxt.config;

import javax.management.RuntimeErrorException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j // 该注解会给你生成log 
public class WebErrorLog {
	
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> runtimeException(RuntimeErrorException e){
		log.error("服务器错误",e);// 开发人员看
		return ResponseEntity.badRequest().body("服务器内部错误");//  400 的响应码，而且给用户提醒return 是直接针对用户
	}
}
