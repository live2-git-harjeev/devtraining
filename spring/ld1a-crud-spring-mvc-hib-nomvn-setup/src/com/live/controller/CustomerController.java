package com.live.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	@GetMapping(value = "/list")
	public String getProducts() {
		System.out.println("The customers!");
		return "customers";
	}
}
