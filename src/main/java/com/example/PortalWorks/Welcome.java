package com.example.PortalWorks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("/Hello")
	public String display() {
		return "Welcome All";
	}

}
