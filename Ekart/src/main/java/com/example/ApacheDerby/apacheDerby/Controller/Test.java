package com.example.ApacheDerby.apacheDerby.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@RequestMapping("/test")
	public String testPost() {
		return "Port is working";
		
	}

}
