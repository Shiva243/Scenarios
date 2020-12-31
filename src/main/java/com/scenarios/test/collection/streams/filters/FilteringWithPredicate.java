package com.scenarios.test.collection.streams.filters;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringWithPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer>  numberList=Arrays.asList(1,2,3,4,1,23,3);
		
		List<Integer> evenNumbers=numberList.stream()
		          .filter(PredicateUtil.isEvenDigit())
		          .collect(Collectors.toList());
		
		evenNumbers.forEach(System.out::println);
		
	}
	
//	public static Predicate<Integer> isEvenDigit()
//	{
//		return n -> n%2==0;
//	}

}
