package com.example.ApacheDerby.apacheDerby.Customer;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "cart")
public class Cart {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	private Integer[] productList;
	private int price ;
	
	
	
	public Integer[] getProductList() {
		return productList;
	}
	public void setProductList(Integer[] productList) {
		this.productList = productList;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Cart(int customerId, Integer[] productList, int price) {
		
		this.customerId = customerId;
		this.productList = productList;
		this.price = price;
	}
	public Cart() {
		
	}
	
}
