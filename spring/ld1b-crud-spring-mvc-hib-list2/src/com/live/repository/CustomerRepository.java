package com.live.repository;

import java.util.List;

import com.live.entity.Customer;

public interface CustomerRepository {
	List<Customer> getCustomers();

	void saveCustomer(Customer customer);
}
