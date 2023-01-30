package com.example.docker_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value="/")
	public String hello() {
		return "Hello World";
	}

}