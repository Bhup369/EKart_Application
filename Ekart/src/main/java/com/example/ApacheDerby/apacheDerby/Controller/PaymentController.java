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
import com.example.ApacheDerby.apacheDerby.Customer.Payment;
import com.example.ApacheDerby.apacheDerby.Customer.PaymentMethod;
import com.example.ApacheDerby.apacheDerby.service.PaymentService;


@RestController
public class PaymentController {
	
	Logger logger = LogManager.getLogger(PaymentController.class);
	
	@Autowired
	PaymentService paymentservice;
	@RequestMapping(method=RequestMethod.POST , value="/payment/{id}" )
	public String createPayments(@PathVariable int id ,  @RequestBody PaymentMethod method) {
		 logger.info("Create Payment is initialized");
		return paymentservice.createPayment(id, method);
		
	}
	@RequestMapping("/payment/{id}")
	public Payment getPaymentById(@PathVariable int id){
		return paymentservice.getPaymentById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET ,value="/payment")
	public List<Payment> getAllPayment() {
		return  paymentservice.getAllPayments();
		
	}
	
}
