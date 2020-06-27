package com.sxt.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Sawwgger2Config {
	
	public Docket docket(Swagger2 swagger2 ) {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo(swagger2)).select()
				.apis(RequestHandlerSelectors.basePackage(swagger2.getBasePackage()))
				.build();
		
	}

	private ApiInfo apiInfo(Swagger2 swagger2) {
		Contact contact = new Contact(swagger2.getName(),swagger2.getUrl(),swagger2.getEmail());
		return new ApiInfoBuilder()
				.contact(contact)
				.title(swagger2.getTitle())
				.description(swagger2.getDescription())
				.termsOfServiceUrl(swagger2.getTermsofServiceUrl())
				.license(swagger2.getLicense())
				.build();
	}
}
