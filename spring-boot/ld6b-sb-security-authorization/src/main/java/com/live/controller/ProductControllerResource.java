package com.live.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerResource {
@GetMapping("/")
public String indexPage() {
	String html = "<html>";
	html += html + "<head><title>Welcome Page</title></head>";
	html +=  "<body>Welcome!! The Products Home Page</body>";
	html +=  "</html>";
	return html;
}
@GetMapping("/userPage")
public String userPage() {
	String html = "<html>";
	html += html + "<head><title>Welcome Page</title></head>";
	html +=  "<body>Welcome User!!</body>";
	html +=  "</html>";
	return html;
}
@GetMapping("/adminPage")
public String adminPage() {
	String html = "<html>";
	html += html + "<head><title>Welcome Page</title></head>";
	html +=  "<body>Welcome Admin!!!</body>";
	html +=  "</html>";
	return html;
}
}
