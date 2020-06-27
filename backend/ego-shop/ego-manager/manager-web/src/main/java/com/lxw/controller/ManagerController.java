package com.lxw.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "用户管理")
public class ManagerController {

	
	@ApiOperation(value = "测试")
	@GetMapping("/test")
	public ResponseEntity<String> test(Integer i){
		int j = 10 / i ;
		return ResponseEntity.ok("成功"+i);
	}
}
