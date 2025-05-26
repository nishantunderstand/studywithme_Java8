package _java8_streamAPI_CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Monday, May 26, 2025 10:57:55 PM 2. Given a list of integers, find out all
 * the numbers starting with 1 using Stream functions?
 * 
 * Why are we converting From Integer to String ?
 * 
 * startsWith is Applicable to String ONLY //<--
 */

public class NumberStartingWithOne {
	public static void main(String[] args) {
		List<Integer> myList = List.of(10, 15, 8, 49, 25, 98, 32);
		myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

		// Store to a List
		List<String> res = myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());

		System.out.println(res);

		// Array Approach
		int[] arr = { 10, 15, 8, 49, 25, 98, 32 };
		List<String> finalres = Arrays.stream(arr).boxed().map(s -> s + "").filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());

		System.out.println(finalres);

	}
}
