package _java8_streamAPI_CodingQuestion;

import java.util.stream.Collectors;

public class FindNonRepeated {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        Character result = input.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .orElse(null);
        System.out.println("First non Repeated" + result);

    }
}
