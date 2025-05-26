package _java8_streamAPI_CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * Monday, May 26, 2025 10:57:39 PM
 * 1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
 */
public class EvenNumber {
	public static void main(String[] args) {
		// 1st Approach
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		// 2nd Approach
		int[] arr = { 10, 15, 8, 49, 25, 98, 32 };
		Map<Boolean, List<Integer>> partitionedMap = Arrays.stream(arr).boxed()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));
		
		System.out.println(partitionedMap);


	}
}
