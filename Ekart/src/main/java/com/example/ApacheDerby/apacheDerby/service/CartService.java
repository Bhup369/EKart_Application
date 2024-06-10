package com.example.ApacheDerby.apacheDerby.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApacheDerby.apacheDerby.Customer.Cart;
import com.example.ApacheDerby.apacheDerby.Customer.Customer;
import com.example.ApacheDerby.apacheDerby.Customer.Product;
import com.example.ApacheDerby.apacheDerby.Repository.CartRepository;
import com.example.ApacheDerby.apacheDerby.Repository.CustomerRepository;
import com.example.ApacheDerby.apacheDerby.Repository.ProductRepository;

@Service
@Transactional
public class CartService {
	
	Logger logger = LogManager.getLogger(CartService.class);
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	
	
	
	
    public String addToCart(int id , Integer[] productList)  {
    	int amount =0;
    	String message = "Added";
    	List<Integer> k = new ArrayList<>();
    	productRepository.findAll().forEach(x->k.add(x.getId()));
    	for(int i:productList) {
    		if(k.contains(i)) {
    			message = "Added";
    			
    		}
    		else {
    			message = "NotAdded";
    			 logger.warn("Products cant be added in cart");
    		}
    	}

    	if(message.equalsIgnoreCase("Added")) {
    		logger.info("Products are available and can be added in cart");
    		for(int i:productList) {
    			amount = amount + productRepository.findById(i).get().getPrice();	
        		}
    		Cart c  = new Cart(id,productList,amount);
    		cartRepository.save(c);
    		
        	}
		return message;	

	}
    
    public Cart getById(int id) {	
    	return cartRepository.findById(id).get();
    	
    }
    
    public List<Cart> getAllTo(){
		List<Cart> n = new ArrayList<>();
		cartRepository.findAll().forEach(x -> n.add(x));
		return n;
    }
   
    
	
	
	
	
	
	
	
	

}
