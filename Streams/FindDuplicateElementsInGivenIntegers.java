package AppDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementsInGivenIntegers {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 15, 8, 25, 32, 49, 25, 98, 32);
		Set<Integer> set = new HashSet<Integer>();
		myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);

		
	}
}
