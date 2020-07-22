package com.live.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.live.entity.Customer;
import com.live.service.CustomerService;

@RestController
@RequestMapping(value = "/customerrest")
public class CustomerRestController {
	@Autowired

	private CustomerService customerService;
	@GetMapping(value = "/list")
	
	public List<Customer> getCustomers() {
		List<Customer> customersList = customerService.getCustomers();
		return customersList;
	}
}
