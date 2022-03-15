package com.valuemotive.lemon.login;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@EnableWebMvc
@ComponentScan("org.springFramework.security.samples.mvc")
public class WebConfig {
	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/loginPage").setViewName("login");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
		
	}

}
