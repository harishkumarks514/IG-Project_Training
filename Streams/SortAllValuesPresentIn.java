package AppDemo;

import java.util.Arrays;
import java.util.List;

public class SortAllValuesPresentIn {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,6,67,86,56,75,73,33);
		myList.stream()
		.sorted()
		.forEach(System.out::println);
	}
}
