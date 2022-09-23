package StreamsInJava;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNon_RepeatedCharacter {

	public static void main(String[] args) {
		String input = ""
				+ "Java Hungry Blog Alive is Awesome.";
		
		Character result = input.chars() //Stream of String
				.mapToObj(s-> Character.toLowerCase(Character.valueOf((char)s))) // first convert to character object and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))//Store the chars in map with count
				.entrySet()
				.stream()
				.filter(entry-> entry.getValue() == 1L)
				.map(entry->entry.getKey())
				.findFirst()
				.get();
		System.out.println(result);
				 
	}
}
