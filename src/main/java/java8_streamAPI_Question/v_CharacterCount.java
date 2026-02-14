package java8_streamAPI_Question;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 22. Write a program to print the count of each character in a String?
 */
public class v_CharacterCount {
  public static void main(String[] args) {
    String input = "String data to count each character";
    System.out.println("=== Blank Space is Also Getting prinited ======");
    input.chars()
      .mapToObj(c -> Character.toLowerCase((char) c))
      .collect(Collectors.groupingBy(
        Function.identity(),
        HashMap::new,
        Collectors.summingInt(e -> 1)
      ))
      .entrySet()
      .stream()  //<--
      .forEach(
        e -> System.out.println(
          "Key : " + e.getKey() + " \t Value :" + e.getValue()
        )
      );


    System.out.println("=== Avoid Blank Space is Also Getting prinited ======");
    input.chars()
      .mapToObj(c -> Character.toLowerCase((char) c))
      .filter(Character::isLetter)
      .collect(Collectors.groupingBy(
        Function.identity(),
        HashMap::new,
        Collectors.summingInt(e -> 1)
      ))
      .entrySet()  //<--
      .forEach(
        e -> System.out.println(
          "Key : " + e.getKey() + " \t Value :" + e.getValue()
        )
      );


  }
}
