package com.scenarios.test.collection.streams.streambuild;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsFromCollections {
	static int x = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4);

		boolean status = list.stream().anyMatch(n -> n % 2 == 0);

		System.out.println(status);

		System.out.println("without lambda");
		list.stream().filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t % 2 == 0;
			}

		}).forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				x = x + t;
				System.out.println(t);
			}
		});

		System.out.println("lambda**");
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		List<String> integerStrings = Arrays.asList("1", "2", "3", "4");

		List<Integer> finalNumbers = integerStrings.stream().map(new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return Integer.valueOf(t);
			}
		}).filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t < 3;
			}

		}).collect(Collectors.toList());

		System.out.println("final Output");
		finalNumbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		
		
		
		
	}
}
