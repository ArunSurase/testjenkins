package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ApiTest {

	@GetMapping(value = "/api")
	public String testApi() {
		return "msg from api demo";
	}
}
