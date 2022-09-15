package AppDemo;

import java.util.Arrays;
import java.util.List;

public class FindTotalNumberOfElementsPresent {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 55, 87, 32, 15);
		long count = myList.stream().count();
		System.out.println(count);
	}
}
