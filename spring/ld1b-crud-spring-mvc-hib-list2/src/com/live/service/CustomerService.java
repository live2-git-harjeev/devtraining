package com.live.service;

import java.util.List;

import com.live.entity.Customer;

public interface CustomerService {
	List<Customer> getCustomers();

	void saveCustomer(Customer customer);
}
