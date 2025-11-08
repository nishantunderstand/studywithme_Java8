package _java8_streamAPI_CodingQuestion;

import java.util.Arrays;

/**
 * 15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
 */
public class _o_SortAndConvertToStream {
  public static void main(String[] args) {
    int arr[] = { 99, 55, 203, 99, 4, 91 };
    //Arrays.sort(arr);
    Arrays.parallelSort(arr);
    // What is the Difference Between them ?
    // Which one is better
    Arrays.stream(arr).forEach(System.out::println);
  }
}
