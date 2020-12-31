package com.scenarios.test.collection.streams.streambuild;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFromFunctionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);
		
		List<Integer> collect = infiniteStream.limit(10).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		//bgenerate
		System.out.println("Random Integer");
Stream<Integer> generateStream = Stream.generate(new Random()::nextInt);
		
		List<Integer> collectRandom = generateStream.limit(10).collect(Collectors.toList());
		
		collectRandom.forEach(System.out::println);

	}

}
