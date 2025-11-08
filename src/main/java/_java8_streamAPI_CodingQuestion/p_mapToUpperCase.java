package _java8_streamAPI_CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 16. How to use map to convert object into Uppercase in Java 8?
 */
public class p_mapToUpperCase {
  public static void main(String[] args) {
    
    String[] names1 = {"aa","bb","cdEF", "ffHH"};
    List<String> names = Arrays.asList("aa","bb","cc", "cdeF", "ffHH");  
    
    List<String> namesList = names.stream()
         .map(String::toUpperCase)
         .collect(Collectors.toList());
    namesList.forEach(System.out::println);
    
    // Arrays.stream(names1).boxed().map(String::toUpperCase).forEach(System.out::println);
    // What went wrong with this approach.
  }
}
