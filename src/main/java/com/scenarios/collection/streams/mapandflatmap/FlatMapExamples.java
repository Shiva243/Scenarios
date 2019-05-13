package com.scenarios.collection.streams.mapandflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapExamples {
	
	public static void main(String[] args){
	List<Integer>  number=Arrays.asList(1,2,3,4,1,23,3);
	
	List<Integer>  number2=Arrays.asList(6,7,8,2);
	
	List<List<Integer>> number3=new ArrayList();
	number3.add(number);
	number3.add(number2);
	
	
	System.out.println("Get the unique elements from both the list");
	number3.stream().distinct().forEach(System.out::println);
	
	System.out.println("using flat map");
	number3.stream().flatMap(n -> n.stream()).distinct().forEach(System.out::println);
	
	}

}
