package com.example.ApacheDerby.apacheDerby.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ApacheDerby.apacheDerby.Customer.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
