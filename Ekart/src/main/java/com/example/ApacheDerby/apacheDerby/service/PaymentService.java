package com.example.ApacheDerby.apacheDerby.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApacheDerby.apacheDerby.Customer.Cart;
import com.example.ApacheDerby.apacheDerby.Customer.Payment;
import com.example.ApacheDerby.apacheDerby.Customer.PaymentMethod;
import com.example.ApacheDerby.apacheDerby.Repository.CartRepository;
import com.example.ApacheDerby.apacheDerby.Repository.PaymentRepository;

@Service
@Transactional
public class PaymentService {
	
	Logger logger = LogManager.getLogger(PaymentService.class);
	
	@Autowired
	PaymentRepository paymentrepository;
	
	@Autowired
	CartRepository cartRepository;
	
	public String createPayment(int id ,PaymentMethod method) {
		int amount = cartRepository.findById(id).get().getPrice();
		Payment p = new Payment();
		p.setAmount(amount);
		p.setId(id);
		p.setPaymentMethod(method);
		paymentrepository.save(p);
		logger.info("Payment is Done");
		
		return "Created";
		
	}
	
	public List<Payment >getAllPayments(){
		List<Payment > p = new ArrayList<>();
		 paymentrepository.findAll().forEach(x->p.add(x));
		 return p;
	}
	
	public Payment getPaymentById(int id) {
		return paymentrepository.findById(id).get() ;
	}
		
	
			
		

	
	
	
	

	
	
	
}
