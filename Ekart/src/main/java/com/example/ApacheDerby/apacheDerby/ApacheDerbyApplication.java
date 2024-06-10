package com.example.ApacheDerby.apacheDerby;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.example.ApacheDerby.apacheDerby.Customer.Customer;
import com.example.ApacheDerby.apacheDerby.Customer.Product;
import com.example.ApacheDerby.apacheDerby.Repository.CustomerRepository;
import com.example.ApacheDerby.apacheDerby.Repository.ProductRepository;





@SpringBootApplication
@EnableWebSecurity
public class ApacheDerbyApplication {
	
	static Logger logger = LogManager.getLogger(ApacheDerbyApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ApacheDerbyApplication.class, args);
		
		logger.info("Application started");
		
	
		
	
		
	}
	
	@Bean
    public CommandLineRunner demo(CustomerRepository custRepo ,ProductRepository productRepo) {
        return (args) -> { 
        	
        	Customer c = new Customer(1,"Rakesh", "Delhi",789780);
        	Customer d = new Customer(2,"Suresh", "Gudgao",786780);
        	Customer e = new Customer(3,"Ramesh", "Merut",785680);
        	Customer f = new Customer(4,"Suraj", "Faizabad" ,569780);
        	custRepo.save(c);
        	custRepo.save(d);
        	custRepo.save(e);
        	custRepo.save(f);
        	logger.info("Adding data while Starting");
        	
        	Product p = new Product(1,"Iphone",2000);
        	Product q = new Product(2,"Redmi",3000);
        	Product r = new Product(3,"Samsung",4000);
        	Product s = new Product(4,"Moto",5000);
        	
        	productRepo.save(p);
        	productRepo.save(q);
        	productRepo.save(r);
        	productRepo.save(s);
        	
        	

        	
        };
        
    }
	                                                
    

}
