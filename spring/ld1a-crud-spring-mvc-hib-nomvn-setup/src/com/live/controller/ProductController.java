package com.live.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
	@GetMapping(value = "/list")
	public String getProducts() {
		System.out.println("In here!");
		return "products";
	}
}
