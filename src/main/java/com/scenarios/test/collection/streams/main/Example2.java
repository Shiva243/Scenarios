package com.scenarios.test.collection.streams.main;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.scenarios.test.collection.streams.models.Product;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products=Arrays.
				asList(new Product("abc",12,"cloth"),new Product("xyz",3,"footwear"),new Product("njj",13,"cloth"));

		
		List<String> newProd=products.stream()
				.filter(p->p.getPrice()<10).
				map(p->p.getDescription())
				.collect(Collectors.toList());
		
		int sum=products.stream().map(p->p.getPrice()).reduce(0,Integer:: sum);
		System.out.println("sum "+sum);

		int sum10=products.stream().map(p->p.getPrice()).reduce(0,(p1,p2)->p1+p2);

		List<Integer> numberList=Arrays.asList(1,2,3,4);
		
		int numberListSum=numberList.stream().mapToInt(i->i).sum();
		System.out.println("sum number list "+numberListSum);

		
		System.out.println("sum10 "+sum10);

		
		
		int sum1= products.stream().mapToInt(p->p.getPrice()).sum();
		System.out.println("Sum 1 :: "+sum1);
		
		//optional Int
		OptionalInt max= products.stream().mapToInt(p->p.getPrice()).max();
		
		System.out.println(max.getAsInt());
		
		// range closed
		IntStream value=IntStream.rangeClosed(1,100)
		.filter(n-> n%2==0);
		System.out.println(value.count());

		//
		List<Integer> intList=IntStream.rangeClosed(1,100)
		.filter(n-> n%2==0)
		.boxed().
		collect(Collectors.toList());
		System.out.println(intList);

		
		
		intList.stream().forEach(n-> {
			
		System.out.println(n*n);
		
		});
		
		
		
	}

}
