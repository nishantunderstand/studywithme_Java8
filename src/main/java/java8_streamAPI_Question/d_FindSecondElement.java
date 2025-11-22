package java8_streamAPI_Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Find Second Highest
 */
public class d_FindSecondElement {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("===== if Present ========");
		myList.stream()
      .distinct()
      .sorted(Collections.reverseOrder())
      .skip(1)
      .findFirst()
      .ifPresent(System.out::println);
	}
}
