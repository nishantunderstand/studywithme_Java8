package _java8_streamAPI_Question_BlogDev_1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class a__Template {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 16, 33);

        List<Integer> myList2 = Arrays.asList(10, 10, 10, 10, 11, 11, 11, 12, 12);
        List<Integer> myList3 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 15, 15, 98, 98);
        String input = "Java articles are Awesome";
        // 11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        // Iterate Over HashMap , Check each Value is greater than 1 or not

        Map<Integer, Long> fMap = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<Integer, Long> entry : fMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // Iterate Over Values Set,
        boolean containsDuplicate = fMap.entrySet().stream().anyMatch(e -> e.getValue()>1L);
        System.out.println("Contains Duplicate : "+containsDuplicate);

    }
}