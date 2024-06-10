package com.example.ApacheDerby.apacheDerby.Repository;

import org.springframework.data.repository.CrudRepository;


import com.example.ApacheDerby.apacheDerby.Customer.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
