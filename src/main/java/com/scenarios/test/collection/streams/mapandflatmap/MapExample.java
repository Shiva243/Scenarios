package com.scenarios.test.collection.streams.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
		//AtomicReference<Integer> i = new AtomicReference<>();
		 List<Integer> even = numbers.stream()
		                              .map(s -> data(s))
		                              .filter(number -> number % 2 == 0)
		                              .collect(Collectors.toList());
		 even.forEach(System.out::println);
	}
	private static Integer data(String s){
		return Integer.parseInt(s);
	}

}

