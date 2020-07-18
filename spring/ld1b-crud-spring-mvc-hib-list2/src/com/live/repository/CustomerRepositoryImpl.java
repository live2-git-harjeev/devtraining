package com.live.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.live.entity.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Customer> getCustomers() {
		//fetch Session from SessionFactory (JDBC Connection)
		Session session = sessionFactory.getCurrentSession();
		//create the query (SQL query)
		//Query<Customer> query = (Query<Customer>)session.createQuery("from Customer order by lastName");
		Query<Customer> query = session.createQuery("fRoM Customer order by lastName", Customer.class);
		//get the result list
		List<Customer> customers = query.getResultList();
		return customers;
	}
}
