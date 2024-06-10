package com.example.ApacheDerby.apacheDerby.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ApacheDerby.apacheDerby.Customer.Cart;

public interface CartRepository extends CrudRepository<Cart,Integer> {

}
