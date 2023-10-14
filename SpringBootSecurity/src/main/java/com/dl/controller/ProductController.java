package com.dl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.model.Product;

@RestController
public class ProductController {
private List<Product> products = new ArrayList<>();
	
	@GetMapping("/")
	public List<Product> userProducts(){
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setUserName("Sai Kiran");
		p1.setUserContact(9876543210L);
		p1.setProductPrice(20000);
		p1.setProductName("Samsung");
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setUserName("Sai Kumar");
		p2.setUserContact(9876543210L);
		p2.setProductPrice(30000);
		p2.setProductName("LG");
		
		products.add(p1);
		products.add(p2);
		
		return products;
		
	}
	
		}


