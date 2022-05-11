package com.sti.taelab.config;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// http://localhost/taelab/swagger-ui/index.html

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket stocksApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("taeLabStock")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.sti.taelab.controller"))
				.paths(regex("/taelab/.*"))
				.build();
				
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("TaeLab Stock REST API")
				.description("TaeLab API Reference for Devs")
				.termsOfServiceUrl("")
				.license("TaeLab License")
				.license("seowju9273@gmail.com").version("1.0").build();
	}
}
