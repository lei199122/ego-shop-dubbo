package com.sxt.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "swagger")
public class Swagger2 {
	/**
	 * 包名称	
	 */
	private String basePackage;
	/**
	 * 联系人名称
	 */
	private String name;
	/**
	 * 联系人主页
	 */
	private String url;	
	/**
	 * 联系人邮箱
	 */
	private String email;
	/**
	 * 项目目主题
	 */
	private String title;
	/**
	 * 该项目描述
	 */
	private String description;
	/**
	 * 该项目的服务团队
	 */
	private String termsofServiceUrl;
	/**
	 * 该项目的授权信息
	 */
	private String license;
	
	
}
