package AppDemo;

import java.util.Arrays;
import java.util.List;

public class FindOutAllEvenNumbers {

	public static void main(String[] args) {
		List<Integer> myList =Arrays.asList(10,4,5,65,34,98,56,77,88,43,58);
		myList.stream().filter(n -> n % 2 ==0).forEach(System.out::println);
	}
}
