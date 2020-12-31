package com.scenarios.test.collection.streams.filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringUniqueTruncSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  numberList=Arrays.asList(1,2,3,4,1,23,3,2,8);
		
		List<Integer> evenNumbers=numberList.stream()
		          .filter(PredicateUtil.isEvenDigit())
		          .distinct()
		          .limit(2)
		          .collect(Collectors.toList());
		evenNumbers.forEach(System.out::println);
		System.out.println("After skipping first 2 elements");
		
		List<Integer> evenNumbers2=numberList.stream()
        .filter(PredicateUtil.isEvenDigit())
        .distinct()
        .skip(2)
        .collect(Collectors.toList());
		evenNumbers2.forEach(System.out::println);

		
		
		
		

	}

}
