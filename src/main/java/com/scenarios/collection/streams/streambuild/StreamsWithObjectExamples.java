package com.scenarios.collection.streams.streambuild;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.scenarios.collection.streams.models.Product;

public class StreamsWithObjectExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products=Arrays.
				asList(new Product("abc",12,"cloth"),new Product("xyz",3,"footwear"),new Product("njj",13,"cloth"));
				
		products.stream().map(Product::getPrice).forEach(System.out::println);
		
		System.out.println("Final Prices");
		
		products.stream().map(new Function<Product, Integer>() {

			@Override
			public Integer apply(Product t) {
				// TODO Auto-generated method stub
				int finalPrice=t.getPrice()+((10*t.getPrice())/100);;
				return finalPrice;
			}
			
		}).forEach(System.out::println);

	}

}
