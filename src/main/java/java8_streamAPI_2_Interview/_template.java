package java8_streamAPI_2_Interview;

import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created : 2026-08-12 01:23:32
 */

// Count occurrences of each character using Streams.
public class _template {
    public static void main(String[] args) {
        // Count occurrences of each character using Streams.
        String input = "aa a a a a b b a a c c c c c c c c c c      a";

        input.chars()
                .mapToObj(ch -> Character.toLowerCase((char)ch))
                .filter(ch -> ch!=' ')
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).forEach((k,v)-> System.out.println(k+"->"+v));

    }
}
