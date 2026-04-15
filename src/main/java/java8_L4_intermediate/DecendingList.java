package _java8_L4_intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DecendingList {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Zebra", "Lion", "Cat", "Dog");
		
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

	}

}
