package com.example.ApacheDerby.apacheDerby.Controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApacheDerby.apacheDerby.Customer.Cart;
import com.example.ApacheDerby.apacheDerby.Customer.Product;
import com.example.ApacheDerby.apacheDerby.service.CartService;


@RestController
public class CartController {
	
	Logger logger = LogManager.getLogger(CartController.class);
	
	
	@Autowired
	CartService cartservice ;

	
	@RequestMapping(method=RequestMethod.POST ,value="/cart/{id}")
	public String addToCart(@PathVariable int id , @RequestBody Integer[] products) {
		  logger.info("Add to cart is initialized");
		return cartservice.addToCart(id, products);
		
	}
	
	@RequestMapping("/cart")
	public List<Cart> getAllCart(){
		return cartservice.getAllTo();
		
	}
	@RequestMapping("/cart/{id}")
	public Cart getCartById(@PathVariable int id) {
		return cartservice.getById(id);
	}
	
	
	
}
