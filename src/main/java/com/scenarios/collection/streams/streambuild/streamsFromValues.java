package com.streams.streambuild;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsFromValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stream<Integer> integerStream=Stream.of(12,20,30,1,3,5);
		
		List<Integer> numbers=integerStream
				                .filter(n -> n <20)
				                .collect(Collectors.toList());
		
		numbers.forEach(System.out::println);
		
		System.out.println("List from integer array");
		Stream<Integer> listFromIntegerArray=Stream.of(new Integer[]{20,30,2,1,9,8,5,45,50});
		
           List<Integer> number2=listFromIntegerArray
        		                     .filter(n -> n <20)
        		                     .collect(Collectors.toList());
		
		number2.forEach(System.out::println);
		
		System.out.println("List empty integer array");

		    Stream<Integer> emptyIntegerStream=Stream.empty();
		    
		  System.out.println(emptyIntegerStream);
		


	}

}
