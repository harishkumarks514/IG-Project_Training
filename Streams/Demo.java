package Streams_In_Java;

import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.ValueExp;

public class Demo {
private static final int Value = 0;

public static void main(String[] args) {
//	Create a list of integers
	List<Integer> number = Arrays.asList(2,3,4,5);

//	Demonstration of map method
	List<Integer> square = number.stream().map(x -> x*x).collect
			(Collectors.toList());

	System.out.println(square);
	
//	create a list of String
	List<String> names = Arrays.asList("Reflection", "Collection","Stream" );
	
//	Demonstration of filter method
	List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
	System.out.println(result);
	
	
//	Demonstration of sorted method
	List<String> show = names.stream().sorted().collect(Collectors.toList());
	System.out.println(show);
	
//	create a list of integers
	List<Integer> numbers = Arrays.asList(2,3,4,5,2);
	
//	collect method returns a set
	Set<Integer> squareSet = numbers.stream().map(x -> x*x).collect(Collectors.toSet());
	System.out.println(squareSet);
	
	
//	Demonstration of forEach method
	number.stream().map(x-> x*x).forEach(y -> System.out.println(y));
	
	
//	Demonstration of reduce method
	
	int even = number.stream().filter(x->x%2 ==0).reduce(0,(ans,i)->ans+i); 
	System.out.println(even);
	
	
	Stream intStream = Stream.of(1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,17); 
	 
	Stream subStreem = intStream.filter(value -> Value > 3);
	
	System.out.println(subStreem);
	
//	 System.out.println( subStreem.findAny());
	
	long count = subStreem.count();
	 System.out.println(" ==="+count);
	 
	 
	 
	 
	// map() Operation
	 Stream strStream = Stream.of("Welcome", "To", "java", "blog");
	 Stream subStream2 = strStream.map(string -> {
	  if (string == "java")
	   return "Java-W3schools";
	  return string;
	 });
	 List welomeList =(List) subStream2.collect(Collectors.toList());
	 System.out.println(welomeList);
	
}
}
