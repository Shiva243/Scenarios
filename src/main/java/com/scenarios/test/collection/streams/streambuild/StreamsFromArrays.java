package com.scenarios.test.collection.streams.streambuild;

import java.util.Arrays;

public class StreamsFromArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; 
		
		int sumOfIntegersFromArray=Arrays.stream(arr).filter(n -> n%2==0).sum();
		System.out.println("SUM::"+sumOfIntegersFromArray);
		
		
	}

}
