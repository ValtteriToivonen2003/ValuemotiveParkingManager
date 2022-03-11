package com.login;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {
	
	void configure(HttpSecurity http) throws Exception {
		http
			.antMatcher("/**").authorizeRequests()
			.antMatchers(new String[] {"/", "/not-restriceted"}).permitAll()
			.anyRequest().authenticated()
			.and()
			.oauth2Login();
	}

}
