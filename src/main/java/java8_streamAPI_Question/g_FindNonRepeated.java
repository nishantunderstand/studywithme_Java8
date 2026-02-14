package java8_streamAPI_Question;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Nov 8, 2025,9:29:24 AM
 * 7. Given a String, find the first non-repeated character in it using Stream functions?
 */
public class g_FindNonRepeated {

    public static void main(String[] args) {
      String input = "ava articles are Awesome";
      System.out.println(input);

      Character result1 = input.chars()
        .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e -> e.getValue() == 1L) //<--
        .map(e -> e.getKey())
        .findFirst()
        .orElse(null);

      System.out.println(result1);

      System.out.println("======  Approach 2 No Need to use value of   ======");
      Optional<Character> result2 =
        input.chars()
          .mapToObj(s -> Character.toLowerCase((char) s))
          .collect(Collectors.groupingBy(
            Function.identity(),
            LinkedHashMap::new,
            Collectors.counting()
          ))
          .entrySet()
          .stream()
          .filter(e -> e.getValue() == 1) //<--
          .map(e -> e.getKey())
          .findFirst();


      result2.ifPresent(ch -> System.out.println(ch));


    }
}
