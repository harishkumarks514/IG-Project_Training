package StreamsInJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAllValuesPresentInItInDescendingOrdr {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,23,32,43,23,33,45,65,56,76,54,333);
		myList.stream()
		.sorted(Collections.reverseOrder())
		.forEach(System.out::println);
	}
}
