package com.prueba.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class mvcConfig {

	@Configuration
	public class MvcConfig implements WebMvcConfigurer {
/*
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/home").setViewName("home");
	        registry.addViewController("/").setViewName("home");
	        registry.addViewController("/hello").setViewName("hello");
	        registry.addViewController("/login").setViewName("login");
	    }
*/
	}
}