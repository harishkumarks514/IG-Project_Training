package Streams_In_Java;

import java.util.Arrays;
import java.util.List;

public class Example_of_Lazy_Initialization {

	public static void main(String[] args) {
		List<Integer> listofNumber = Arrays.asList(10, 5, 6, 11, 8);
		listofNumber.stream().filter((a) -> a > 5).forEach(System.out::println);
	}
}