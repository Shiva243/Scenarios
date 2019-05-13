package com.scenarios.collection.streams.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");

		 List<Integer> even = numbers.stream()
		                              .map(s -> Integer.valueOf(s))
		                              .filter(number -> number % 2 == 0)
		                              .collect(Collectors.toList());
		 even.forEach(System.out::println);

	}

}
