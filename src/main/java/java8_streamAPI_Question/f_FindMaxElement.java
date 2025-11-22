package java8_streamAPI_Question;

import java.util.Arrays;
import java.util.List;

/**
 * Tuesday, May 27, 2025 6:39:57 PM 
 * 6. Given a list of integers, find the maximum value element present in it using Stream functions?
 */

public class f_FindMaxElement {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,99999999);

		System.out.println("===== Stream Approach ====");
		Integer max = myList.stream().max(Integer::compare).get();
		System.out.println(max);


		
		System.out.println("===== Array Approach ====");
		int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15,9999999};
		Integer max1 = Arrays.stream(arr).boxed().max(Integer::compare).get();
		System.out.println(max1);


    System.out.println("===== Stream Approach -2 ====");
    Integer max2 = myList.stream().max(Integer::compare).orElse(-1);
    System.out.println(max2);


    System.out.println("===== Stream Approach -3 ====");
    myList.stream().max(Integer::compare).ifPresent(System.out::println);

    System.out.println("===== Stream Approach -4 ====");

    List<Integer> myList1 = Arrays.asList(); // Update it
    myList1.stream()
      .max(Integer::compare)
      .ifPresentOrElse(
        System.out::println,
        () -> System.out.println("No Maximium Element Found ::")
      );


  }
}
