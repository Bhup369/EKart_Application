package com.example.ApacheDerby.apacheDerby.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApacheDerby.apacheDerby.Customer.Customer;
import com.example.ApacheDerby.apacheDerby.Customer.Product;
import com.example.ApacheDerby.apacheDerby.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice ;
	
	
/*1 Getting All Customers Details*/
	@RequestMapping("/product")
	public List<Product> getAllTo(){
		return productservice.getAllTo();	
	}
/*3 Getting Customer By ID*/
	@RequestMapping("/product/{id}")
	public Product getTo(@PathVariable Integer id) {
		return productservice.getById(id);
	}
/*2 Creating Customer*/
	@RequestMapping(method=RequestMethod.POST ,value="/product")
	public void createTo(@RequestBody Product c) {
		productservice.createTo(c);
	}
/*4 Updating Customer Details*/
	@RequestMapping(method=RequestMethod.PUT ,value="/product/{id}")
	public void updateTo(@PathVariable Integer id ,@RequestBody Product c) {
		productservice.upadateTo(id, c);
	}
/*5 Deleting Customer Details*/
	@RequestMapping(method=RequestMethod.DELETE ,value="/product/{id}")
	public void deleteTo(@PathVariable Integer id ) {
		productservice.deleteTo(id);
	}
}
