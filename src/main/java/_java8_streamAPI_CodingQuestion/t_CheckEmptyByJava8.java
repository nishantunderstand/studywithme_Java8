package _java8_streamAPI_CodingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
 */
public class t_CheckEmptyByJava8 {
  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> list = new ArrayList<>();
    // Check size ??
    if (list.size() == 0) {
      System.out.println("Empty");
    } else {
      System.out.println("Not Empty");
    }

  }
}

