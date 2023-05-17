package com.ktds.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelComeController {
	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
}
