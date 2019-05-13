package com.scenarios.collection.streams.filters;

import java.util.function.Predicate;

public class PredicateUtil {

	
	public static Predicate<Integer> isEvenDigit()
	{
		return n -> n%2==0;
	}

}
