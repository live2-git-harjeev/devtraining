package com.live.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.live.model.Customer;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	@GetMapping(value = "/list")
	public String getProducts(Model modelFromSpring) {
		// The customersList is the model
		// The customersList model will reach the view
		List<Customer> customersList = getCustomersStub();
		modelFromSpring.addAttribute("customerModelFromController", customersList);
		// customers is the view
		return "customers";
	}

	private List<Customer> getCustomersStub() {
		System.out.println("/customer/list");
		List<Customer> customersList = new ArrayList<>();
		// customer 1
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Sandeep");
		customer.setLastName("S");
		customersList.add(customer);

		// customer 2
		customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Shrikant");
		customer.setLastName("Kharade");
		customersList.add(customer);

		return customersList;
	}
}
