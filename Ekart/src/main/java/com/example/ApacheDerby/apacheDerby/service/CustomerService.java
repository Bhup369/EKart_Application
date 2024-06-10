package com.example.ApacheDerby.apacheDerby.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApacheDerby.apacheDerby.Customer.Customer;
import com.example.ApacheDerby.apacheDerby.Repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	/*1 Getting All Customers Details*/
	public List<Customer> getAllTo(){
		List<Customer> n = new ArrayList<>();
		customerRepository.findAll().forEach(x -> n.add(x));
		return n;
	}
/*2 Creating Customer*/
	public void createTo (Customer c) {
		customerRepository.save(c);
	}
/*3 Getting Customer By ID*/
	public Customer getById(Integer id) {
		return customerRepository.findById(id).get();
	}
/*4 Updating Customer Details*/
	public void upadateTo(Integer id ,Customer c) {
		customerRepository.save(c);
	}
/*5 Deleting Customer Details*/
	public void deleteTo(Integer id) {
		customerRepository.deleteById(id);


}
}
