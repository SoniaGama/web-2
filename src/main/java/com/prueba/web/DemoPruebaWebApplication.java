package com.prueba.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.prueba.web.controllers"})
public class DemoPruebaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPruebaWebApplication.class, args);
	}
}
