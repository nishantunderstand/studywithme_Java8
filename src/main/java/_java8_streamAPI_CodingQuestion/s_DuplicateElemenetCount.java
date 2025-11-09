package _java8_streamAPI_CodingQuestion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *19. How to find only duplicate elements with its count from the String ArrayList in Java8?
 */
public class s_DuplicateElemenetCount {
  public static void main(String[] args) {
      List<String> names = Arrays.asList("AA","BB","AA","CC");

      HashMap<String, Integer> namesCount  = names.stream()
                                              .collect(Collectors.groupingBy(
                                                Function.identity(),
                                                HashMap::new,
                                                Collectors.summingInt(e->1)
                                              ));


      // iterate over namesCount , Return the item whose values is greater than 1
      namesCount.entrySet()
        .stream()
        .filter(e->e.getValue()>1)
        .forEach(e->
            System.out.println("Duplicate " + e.getKey() + " Count :" + e.getValue())
          );

    System.out.println("======WORKING=======");
    names.stream()
      .collect(Collectors.groupingBy(
        Function.identity(),
        LinkedHashMap::new,
        Collectors.summingInt(e -> 1)
      ))
      .entrySet()
      .stream()
      .filter(e -> e.getValue() > 1)
      .forEach(e ->
        System.out.println("Duplicate " + e.getKey() + "Count " + e.getValue())
      );
  }
}
