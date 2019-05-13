package com.scenarios.collection.streams.reducersexamples;

import java.util.Arrays;
import java.util.List;

import com.scenarios.collection.streams.models.Product;

public class ReducersWithInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products=Arrays.
				asList(new Product("abc",12,"cloth"),new Product("xyz",3,"footwear"),new Product("njj",13,"cloth"));
		
		int sum=products.stream().map(Product::getPrice)
	                     .reduce(0,(p1,p2)->(p1+p2));
		System.out.println("Sum of all the prices: "+sum);
		
		int multiply=products.stream().map(Product::getPrice)
                .reduce(1,(p1,p2)->(p1*p2));
System.out.println("product of all the prices: "+multiply);


		
	}

}
