package com.demo.demo_deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

	@GetMapping("/hi")
	public String getMsg() {
		return "Hi this is my first deployment";
	}
}
