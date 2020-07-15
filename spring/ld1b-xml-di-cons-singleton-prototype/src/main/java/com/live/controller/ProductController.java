package com.live.controller;

import com.live.service.ProductService;

public class ProductController {
	ProductService productService;
public ProductController(ProductService productService) {
	this.productService = productService;
}
}
