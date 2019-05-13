package com.scenarios.collection.streams.reducersexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.scenarios.collection.streams.models.Product;

public class ReducersWithoutInitials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products=Arrays.
				asList(new Product("abc",12,"cloth"),new Product("xyz",3,"footwear"),new Product("njj",13,"cloth"));
		
		Optional<Integer> sum=products.stream().map(Product::getPrice)
	                     .reduce((p1,p2)->(p1+p2));
		
		System.out.println("SUM using or else::"+sum.orElse(0));
		
		if(sum.isPresent())
		{
			System.out.println("sum using ifpresent::"+sum.get());
		}else
		{
			System.out.println(0);
		}
		
		//using integer
		Optional<Integer> sumusingInteger=products.stream().map(Product::getPrice)
        .reduce(Integer::sum);
		System.out.println("SUM Integer using or else::"+sumusingInteger.orElse(0));
		
		//min and Max
		//using integer
				Optional<Integer> minInteger=products.stream().map(Product::getPrice)
		        .reduce(Integer::min);
				System.out.println("min Integer using or else::"+minInteger.orElse(0));
				
				Optional<Integer> maxInteger=products.stream().map(Product::getPrice)
				        .reduce(Integer::max);
						System.out.println("max Integer using or else::"+maxInteger.orElse(0));
				
						
											
	}

}
