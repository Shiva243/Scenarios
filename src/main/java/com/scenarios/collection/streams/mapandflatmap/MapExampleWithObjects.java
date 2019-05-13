package com.scenarios.collection.streams.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.streams.models.Product;
import com.streams.models.ProductWithTax;

public class MapExampleWithObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products=Arrays.
				asList(new Product("abc",12,"cloth"),
						new Product("xyz",3,"footwear"),
						new Product("njj",13,"cloth"));
		
		
List<String> upperCaseDescriptions=products.stream()
        .map(Product::getDescription)
        .map(String::toUpperCase)
        .collect(Collectors.toList());
upperCaseDescriptions.forEach(System.out::println);

List<ProductWithTax> productTaxedList=products.stream().map(p -> {
	
	ProductWithTax taxedProducts=new ProductWithTax();
	
	taxedProducts.setType(p.getType());
	taxedProducts.setDescription(p.getDescription());
	taxedProducts.setPrice(p.getPrice());
	float tax=(p.getPrice()*12)/100;
	taxedProducts.setTax(tax);
	return taxedProducts;
}).filter(tp -> tp.getTax() > 0).collect(Collectors.toList());

productTaxedList.forEach(System.out::println);

List<Float> allProductTaxes=products.stream().map(p -> {		
	float tax=(p.getPrice()*12)/100;	
	return tax;
}).collect(Collectors.toList());

allProductTaxes.forEach(System.out::println);


System.out.println("to map Example");

 Map<String,Integer> productDesc=products.stream().
		 collect(Collectors.toMap(Product::getDescription, Product::getPrice));
 System.out.println("Map EX"+productDesc);

	}

}
