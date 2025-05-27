package _java8_streamAPI_CodingQuestion;

import java.util.Arrays;
import java.util.List;

/**
 * Tuesday, May 27, 2025 6:39:57 PM 
 * 6. Given a list of integers, find the maximum value element present in it using Stream functions?
 */

public class FindMaxElement {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,99999999);
		
		
		System.out.println("===== Stream Approach ====");
		Integer max = myList.stream().max(Integer::compare).get();
		System.out.println(max);
		
		
		System.out.println("===== Array Approach ====");
		int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15,9999999};
		Integer max1 = Arrays.stream(arr).boxed().max(Integer::compare).get();
		System.out.println(max1);
	}
}
