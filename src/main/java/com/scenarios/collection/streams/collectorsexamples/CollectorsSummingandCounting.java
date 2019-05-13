package com.scenarios.collection.streams.collectorsexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectorsSummingandCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  numbers=Arrays.asList(1,2,3,4,1,23,3);

		long count=numbers.stream().filter(n -> n%2==0).collect(Collectors.counting());
		
		System.out.println("Count::"+count);
		
long sum=numbers.stream().collect(Collectors.summingInt(n ->n));
		
		System.out.println("Sum::"+sum);
double avg=numbers.stream().collect(Collectors.averagingInt(n -> n));
		
		System.out.println("Average::"+avg);
		
		Comparator<Integer> numbercomp=Comparator.comparingInt(n ->n);
		
Optional<Integer> maxOptional=numbers.stream().collect(Collectors.maxBy(numbercomp));
		
		System.out.println("max::"+maxOptional.orElse(0));
		
Optional<Integer> minOptional=numbers.stream().collect(Collectors.minBy(numbercomp));
		
		System.out.println("min::"+minOptional.orElse(0));

		
	}

}
