package _java8_streamAPI_CodingQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 11. Given an integer array nums , return true if any value appears at least
 * twice in the array, and return false if every element is distinct.
 */
public class k_ContainDuplicate {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    /**
     * Without Java8
     * Iterate Over all the arrays.
     * Define HashSet
     * HashSet : If it already seen return otherwise return true.
     */
    HashSet<Integer> seen = new HashSet<>();
    Arrays.stream(nums).boxed().forEach(System.out::println);



    Arrays.stream(nums)
      .boxed()
      .filter(c->!seen.add(c))
      .findFirst()
      .ifPresent(e->System.out.println(e));
      // I just to return true or false

      
      List<Integer> myList = Arrays.stream(nums).boxed().collect(Collectors.toList());
      HashSet<Integer> hs = new HashSet<>(myList);
      if(hs.size()== myList.size()){
        System.out.println("False");
      }else{
        System.out.println("Duplicate Present ");
        System.out.println("True");
      }

  }
}

