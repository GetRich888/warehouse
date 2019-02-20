package com.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

	@RequestMapping("/index")
	public String index() {
		System.out.println("有基佬开我裤链");
		return "index";
	}
}
