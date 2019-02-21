package com.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/article-list")
	public String article() {
		return "article-list";
	}
}
