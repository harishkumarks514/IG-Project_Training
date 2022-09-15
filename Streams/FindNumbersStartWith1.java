package AppDemo;

 

import java.util.Arrays;
import java.util.List;

//Find  out all numbers starting with 1 using Stream function
public class FindNumbersStartWith1 {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		myList.stream().map(a ->  a + "") //convert integers to string
		.filter(a -> a.startsWith("1")).forEach(System.out:: println);
	}
}