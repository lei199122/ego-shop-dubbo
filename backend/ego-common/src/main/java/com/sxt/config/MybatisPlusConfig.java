package com.sxt.config;

import org.springframework.context.annotation.Configuration;
/**
 * 分頁插件
 * @author leiwe
 *
 */

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
@Configuration
public class MybatisPlusConfig {
			
	public PaginationInterceptor paginationInterceptor(){
		PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
		paginationInterceptor.setDialectType("mysql");
		return paginationInterceptor;
		
	}
}
