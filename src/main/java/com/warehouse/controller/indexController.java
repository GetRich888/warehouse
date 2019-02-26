package com.warehouse.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
