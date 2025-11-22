package java8_streamAPI_Question;

import java.util.Arrays;
import java.util.List;

/**
 * Tuesday, May 27, 2025 6:24:56 PM 4. Given the list of integers, find the
 * first element of the list using Stream functions?
 * ?? It works on Stirng as well Integer ? Does it have any Constraint ?
 */

public class d_FindFirstElement {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		
		// myList.stream().findFirst().forEach(System.out::println);  //<-- Will Not WORK
		System.out.println("===== if Present ========");
		myList.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("===== get ========");
		Integer res = myList.stream().findFirst().get();
		System.out.println(res);
		
		System.out.println("===== Direct Approach ========");
		
		// Direct Sol
		System.out.println(myList.get(0));
	}
}
