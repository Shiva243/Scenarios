package com.scenarios.test.collection.streams.matchandfind;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.scenarios.test.collection.streams.models.Product;

public class FindExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Product> products=Arrays.
				asList(new Product("abc",12,"cloth"),new Product("xyz",3,"footwear"),new Product("njj",13,"cloth"));
		Optional<Product> productOptional=products.stream().filter(p-> p.getPrice()>5).findAny();
	
		Product p=productOptional.orElseThrow(() 
				-> new RuntimeException("no data exist"));
		System.out.println(p);
		
		
		System.out.println("Find First");
		Optional<Product> productFirstOptional=products.stream().filter(p1-> p1.getPrice()>5).findFirst();
		
		Product p1=productFirstOptional.orElseThrow(() 
				-> new RuntimeException("no data exist"));
		System.out.println(p1);
		
		System.out.println("Optional OfNullable");
		Optional<Product> productFiftyOptional=products.stream().filter(p3-> p3.getPrice()>50).findFirst();
		productFiftyOptional.map(product ->product.getPrice());
		
	}

}
