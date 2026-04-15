package java8_L3_beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListToString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "B", "C");
		
		String string = list.stream().collect(Collectors.joining(","));
		
		System.out.println(string);

	}

}
