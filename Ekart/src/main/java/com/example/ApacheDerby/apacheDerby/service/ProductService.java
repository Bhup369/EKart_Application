package com.example.ApacheDerby.apacheDerby.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApacheDerby.apacheDerby.Customer.Customer;
import com.example.ApacheDerby.apacheDerby.Customer.Product;
import com.example.ApacheDerby.apacheDerby.Repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	ProductRepository productrepository;
	

	
	/*1 Getting All Product Details*/
	public List<Product> getAllTo(){
		List<Product> n = new ArrayList<>();
		productrepository.findAll().forEach(x -> n.add(x));
		return n;
	}
/*2 Creating Product*/
	public void createTo (Product c) {
		productrepository.save(c);
	}
/*3 Getting Product By ID*/
	public Product getById(Integer id) {
		return productrepository.findById(id).get();
	}
/*4 Updating Product Details*/
	public void upadateTo(Integer id ,Product c) {
		productrepository.save(c);
	}
/*5 Deleting Product Details*/
	public void deleteTo(Integer id) {
		productrepository.deleteById(id);
}
}
