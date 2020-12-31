package com.scenarios.test.collection.streams.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>  number=Arrays.asList(1,2,3,4,1,23,3);
		
		List<Integer>  number2=Arrays.asList(6,7,8);
		
		List<List<Integer>> number3=new ArrayList();
		number3.add(number);
		number3.add(number2);
		
		
		List<Integer> sqnum=number.stream()
				.filter(n-> n>3)
				.map(n->n*n)
				.collect(Collectors.toList());
		
		sqnum.forEach(System.out::println);
		
		int n=number.stream().reduce(0,(a,b)-> a+b);
		System.out.println(n);
		
		int n1=number.stream().reduce(1,(a,b)-> a*b);
		System.out.println(n1);
		
		Optional<Integer> opy=number.stream().reduce((a,b)-> a*b);
		
		System.out.println(opy.get());
		
		number3.stream()
		.flatMap(Collection::stream)
		.collect(Collectors.toList());
		
		
		List<Integer> unique=number.stream()
				.distinct()
				.skip(2)
				.collect(Collectors.toList());
		System.out.println(unique);
		unique.forEach(System.out::println);
		
		


	}

}
