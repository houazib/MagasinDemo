package com.magasin.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

	@GetMapping("/login")
	public String login() {
		return "/login";
	}

	@GetMapping("/user")
	public String user() {
		return "/user";
	}

	@GetMapping("/")
	public String index() {
		return "/index";
	}

}
