package com.dojo.user_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserController {

	@Value("${dojo.message}")
	private String message;
	
	
	@GetMapping(path = "message")
	public String message() {
		return this.message;
	}
}
