package com.scenarios.collection.streams.matchandfind;

import java.util.Arrays;
import java.util.List;

import com.streams.models.Product;

public class MatchExample {
public static void main(String[] args) {
	List<Product> products=Arrays.
			asList(new Product("abc",12,"cloth"),new Product("xyz",3,"footwear"),new Product("njj",13,"cloth"));
	
	boolean anyMatchStatus=products.stream().anyMatch( p->p.getPrice()==12);
	System.out.println("Any product price with 12::"+anyMatchStatus);
	
	boolean allMatchStatus=products.stream().allMatch( p->p.getPrice()>2);
	System.out.println("If All product price with >2::"+allMatchStatus);
	
	boolean noneMatchStatus=products.stream().noneMatch( p->p.getPrice()>2);
	System.out.println("If No  product price with >2::"+noneMatchStatus);
}
}
