package com.microservices.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/docker-test")
	public String getData() {
		return "Spring boot Application using Docker on Kubernetes";
	}

}
