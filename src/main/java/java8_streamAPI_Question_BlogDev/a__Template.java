package java8_streamAPI_Question_BlogDev_PRAGATI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class a__Template {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 16, 33);
        List<Integer> myList1 = new ArrayList<>();
        List<Integer> myList2 = Arrays.asList(10, 10, 10, 10, 11, 11, 11, 12, 12);
        List<Integer> myList3 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 15, 15, 98, 98);
        String input = "Java articles are Awesome";
        List<String> myList4 = Arrays.asList("Java","String","Awesome");
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        int[] arr = {11,12,13,14,15,16,99};


        // 22. Write a program to print the count of each character in a String?
        input.chars()
                .mapToObj(ch -> Character.toLowerCase((char)ch))
                .filter(ch -> ch!=' ')
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .forEach((k,v) -> System.out.println(k+"="+v));


    }
}