package com.example.ApacheDerby.apacheDerby.Repository;

import org.springframework.data.repository.CrudRepository;


import com.example.ApacheDerby.apacheDerby.Customer.Payment;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {

}
