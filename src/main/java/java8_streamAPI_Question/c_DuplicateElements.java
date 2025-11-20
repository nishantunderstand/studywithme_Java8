package java8_streamAPI_Question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Tuesday, May 27, 2025 6:09:54 PM 3. How to find duplicate elements in a given
 * integers list in java using Stream functions?
 */

public class c_DuplicateElements {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		// HashSet Approach
		Set<Integer> seen = new HashSet<Integer>();
		myList.stream().filter(s->!seen.add(s)).forEach(System.out::println);
	}
}
