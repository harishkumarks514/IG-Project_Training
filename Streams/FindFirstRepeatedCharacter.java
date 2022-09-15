package AppDemo;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.catalina.ha.backend.CollectedInfo;

public class FindFirstRepeatedCharacter {

	
	public static void main(String[] args) {
		String input = "Java Hurry Blog Alive is Awesome";
		Character result = input.chars()
		.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s )))	
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue() == 1L)
		.map(entry -> entry.getKey())
		.findFirst()
		.get();
		System.out.println(result);
	
	}
}
