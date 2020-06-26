package com.sxt.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
 * @author 接口文檔實體類
 *
 */
@Da
@ConfigurationProperties(prefix = "swagger2")
public class Swagger {
	/**
	 * 包名稱
	 */
	private String basePackage;
	
	/**
	 * 聯繫人的名稱
	 */
	private String name;
	/**
	 * 聯繫人的主頁
	 */
	private String url;
	/**
	 * 聯繫人的郵箱
	 */
	private String email;
	/**
	 * 該項目的主題
	 */
	private String title;
	/**
	 * 該項目的描述
	 */
	private String description;
	/**
	 * 該項目的服務團隊
	 */
	private String termsofServiceUrl;
	/**
	 * 該項目的受益信息
	 */
	private String license;
	
}
