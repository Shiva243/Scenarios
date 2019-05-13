package com.scenarios.collection.streams.filters;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.streams.models.User;

public class PredicatesType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 1, 23, 3, 2, 8, 12, 15);

		Predicate<Integer> evenPredicate = (n) -> n % 2 == 0;
		Predicate<Integer> lessthan10Predicate = (n) -> n < 10;
		System.out.println("Less than 10 even digits");
		
		numberList.stream().filter(evenPredicate.and(lessthan10Predicate)).forEach(System.out::println);

		
		
		System.out.println("evan Digit or lessthan 10 all numbers");
		numberList.stream().filter(evenPredicate.or(lessthan10Predicate)).forEach(System.out::println);
		System.out.println(lessthan10Predicate.test(3));

		
		System.out.println("Override Predicate class");

		//Predicate to check if the string length is greater than 10
		Predicate<String> hasLengthgreater10 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length() > 10;
			}
		};

		//predicate to check if the string contains A 
		Predicate<String> containsA = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.contains("a");
			}
		};
		String s = "Naveen";

		System.out.println(hasLengthgreater10.test(s));

		System.out.println(hasLengthgreater10.or(containsA).test(s));

		
		Arrays.stream(new String[] { "Naveen", "testingjbbkbn", "tre" })
		.filter(hasLengthgreater10.or(containsA))
				.forEach(System.out::println);

		
		System.out.println("*********");
		Arrays.stream(new String[] { "Naveen", "testingjbbkbn", "tre" })
				.filter(hasLengthgreater10.negate().
						or(containsA)).forEach(System.out::println);

		System.out.println("*********Admin Role User********");

		User u1 = new User("Naveen", "admin");
		User u2 = new User("Srinivas", "user");
		List<User> userList = Arrays.asList(u1, u2);

		BiPredicate<User, String> hasAdminRole = new BiPredicate<User, String>() {

			@Override
			public boolean test(User t, String s) {
				// TODO Auto-generated method stub
				return t.getRole().equalsIgnoreCase(s);
			}

		};

		userList.stream().filter(user -> hasAdminRole.test(user, "admin")).
		forEach(System.out::println);

		System.out.println("*******");

		BiPredicate<Integer, Integer> greaterNumberPredicate = new BiPredicate<Integer, Integer>() {

			@Override
			public boolean test(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t > u;
			}

		};

		System.out.println(greaterNumberPredicate.test(3, 2));

	}

}
