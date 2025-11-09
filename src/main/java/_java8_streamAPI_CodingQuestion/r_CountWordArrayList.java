package _java8_streamAPI_CodingQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 18. How to count each element/word from the String ArrayList in Java8?
 */
public class r_CountWordArrayList {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("AA", "BB", "AA", "AA");
    // For Count, I need HashMap

    /**
    HashMap<String, Long> namesCnt1 = names.stream()
                                      .collect(Collectors.groupingBy(
                                        Function.identity(),
                                        Collectors.counting()));
    System.out.println(namesCnt1);
     * Violated Principle: “Program to an Interface, Not to an Implementation”
     * Dependency Inversion Principle (DIP) and Interface Segregation concepts.
     */

    Map<String, Long> namesCnt2 = names.stream()
      .collect(Collectors.groupingBy(
        Function.identity(),
        Collectors.counting()));

    System.out.println("namesCnt2" +namesCnt2);


     HashMap<String, Long> namesCnt3 = names.stream()
                                             .collect(Collectors.groupingBy(
                                             Function.identity(),
                                             HashMap::new,
                                             Collectors.counting()));  //<-- Counting return Long
    System.out.println("namesCnt3" +namesCnt3);


    HashMap<String, Integer> namesCnt4 = names.stream()
      .collect(Collectors.groupingBy(
        Function.identity(),
        HashMap::new,
        Collectors.summingInt(e -> 1) // counts as Integer
      ));

    System.out.println("namesCnt4" +namesCnt4);



    HashMap<String, Long> namesCnt5 = names.stream()
      .collect(Collectors.groupingBy(
        Function.identity(),
        HashMap::new,
        Collectors.summingLong(e -> 1L)  //<-- // counts as Long
      ));

    System.out.println("namesCnt5" +namesCnt5);




  }
}


/**
 * Demonstrates different approaches using Collectors:
 * - counting() → returns Long
 * - summingInt(e -> 1) → returns Integer
 * - summingLong(e -> 1L) → returns Long
 * - summingDouble(e -> 1.0) → returns Double
 */