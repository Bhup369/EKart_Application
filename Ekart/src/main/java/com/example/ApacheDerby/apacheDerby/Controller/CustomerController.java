package com.example.ApacheDerby.apacheDerby.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApacheDerby.apacheDerby.Customer.Customer;
import com.example.ApacheDerby.apacheDerby.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice ;
	
	
/*1 Getting All Customers Details*/
	@RequestMapping("/customer")
	public List<Customer> getAllTo(){
		return customerservice.getAllTo();	
	}
/*3 Getting Customer By ID*/
	@RequestMapping("/customer/{id}")
	public Customer getTo(@PathVariable Integer id) {
		return customerservice.getById(id);
	}
/*2 Creating Customer*/
	@RequestMapping(method=RequestMethod.POST ,value="/customer")
	public void createTo(@RequestBody Customer c) {
		customerservice.createTo(c);
	}
/*4 Updating Customer Details*/
	@RequestMapping(method=RequestMethod.PUT ,value="/customer/{id}")
	public void updateTo(@PathVariable Integer id ,@RequestBody Customer c) {
		customerservice.upadateTo(id, c);
	}
/*5 Deleting Customer Details*/
	@RequestMapping(method=RequestMethod.DELETE ,value="/customer/{id}")
	public void deleteTo(@PathVariable Integer id ) {
		customerservice.deleteTo(id);
	}
	
}
