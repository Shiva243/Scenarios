package com.scenarios.collection.streams.collectorsexamples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.attribute.standard.JobOriginatingUserName;

import com.streams.models.Product;




public class CollectorsGroupingAndPartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products=Arrays.
				asList(new Product("abc",12,"cloth"),new Product("xyz",3,"footwear"),new Product("njj",13,"cloth"));


//summing
int sum=products.stream().
collect(Collectors.summingInt(p->p.getPrice()));

System.out.println("summing price:: "+sum);

//average int
double average=products.stream().collect(Collectors.averagingInt(p->p.getPrice()));
System.out.println("Average price:: "+average);

//max
Comparator<Product> productcomparator=Comparator.comparingInt(Product::getPrice);

Optional<Product> maxProduct=products.stream().collect(Collectors.maxBy(productcomparator));

System.out.println("Max Price product ::"+maxProduct.get().getDescription());

//summarizing int
IntSummaryStatistics statics=products.stream().collect(Collectors.summarizingInt(p->p.getPrice()));




System.out.println("Statics MiN:: "+statics.getMin());
System.out.println("Statics Max:: "+statics.getMax());


// String joining
String joiningoutput=products.stream().map(p->p.getDescription()).collect(Collectors.joining());

System.out.println("String joining op::"+joiningoutput);

String joiningoutputwithseperator=products.stream().map(p->p.getDescription()).collect(Collectors.joining(","));
System.out.println("joining with seperator:: "+joiningoutputwithseperator);


//groupby

Map<String,List<Product>> typeMap= products.stream().collect(Collectors.groupingBy(p ->p.getType()));


System.out.println("simple group by::"+typeMap);

Map<String, List<Product>> customtype=products.stream().collect(Collectors.groupingBy(p -> {
	if(p.getPrice()<4) return "LOW PRICE";
	else if(p.getPrice()==5) return "NORMAL";
	else return "HIGH PRICE";
}));

System.out.println("custom group by:: "+customtype);

//nested grouping

Map<String,Map<String,List<Product>>> nestedMap=
products.stream()
.collect(Collectors.groupingBy(p ->p.getType(), Collectors.groupingBy(p -> {
	if(p.getPrice()<=4) return "LOW PRICE";
	else if(p.getPrice()>4 && p.getPrice()<=6 ) return "NORMAL";
	else return "HIGH PRICE";
})));

System.out.println("nested Map:: "+nestedMap);


Map<String,Long> typeMapCount= 
products.stream().collect(Collectors.groupingBy(p ->p.getType(),Collectors.counting()));


System.out.println("type map count:: "+typeMapCount);

Map<String,Integer> typeMapsumming= 
products.stream().collect(Collectors.groupingBy(p ->p.getType(),Collectors.summingInt(p->p.getPrice())));


System.out.println("type map summing price:: "+typeMapsumming);

Map<String,Optional<Product>> typeMapmaxBy= 
products.stream().collect(Collectors
		.groupingBy(p ->p.getType(),
				Collectors.maxBy(Comparator.comparingInt(p->p.getPrice()))));


System.out.println("type max price product:: "+typeMapmaxBy);

//Collecting and then is After Collecting the elements in the Stream next what to do
		Map<String, Product> collectingAndThen = products.stream()
				.collect(Collectors.groupingBy(p -> p.getType(), Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingInt(Product::getPrice)), Optional::get)));

System.out.println("Collecting And Then:: "+collectingAndThen);

//pratitioning

Map<Boolean,List<Product>> partionEx=products.stream().collect(Collectors.partitioningBy(p->p.getPrice()<5));

System.out.println(partionEx);
System.out.println(partionEx.get(true));

List<Integer>  givenList=Arrays.asList(6,7,8);

List<Integer> result = givenList.stream().filter(n->n>6)
.collect(Collectors.collectingAndThen(Collectors.toList(),Collections::<Integer>unmodifiableList));
//result.add(9);
System.out.println("Final Result :: "+result);






	}

	

}
