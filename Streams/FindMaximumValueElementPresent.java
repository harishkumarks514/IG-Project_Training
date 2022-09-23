package StreamsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class FindMaximumValueElementPresent {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,20,30,40,100,323,445,56,6443,3,45,65,657);
		int max = myList.stream().max(Integer::compare).get();
		System.out.println(max);
	}
}
