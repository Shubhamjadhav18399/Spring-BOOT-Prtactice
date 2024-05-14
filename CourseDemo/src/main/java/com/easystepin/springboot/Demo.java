package com.easystepin.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello JavaTpoint";
	}
}
