package java8_L4_beforeadv;

import java.util.*;
import java.util.stream.*;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> nums = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

        System.out.println("Sequential:");
        nums.stream().forEach(n -> System.out.print(n + " "));

        System.out.println("\nParallel:");
        nums.parallelStream().forEach(n -> System.out.print(n + " "));
        
        
        List<Integer> list = IntStream.range(1, 10000).boxed().collect(Collectors.toList());
        
        System.out.println("\nSum: "+list.parallelStream().sequential().reduce(0,Integer::sum));
        System.out.println("\nSum: "+list.stream().sequential().reduce(0,Integer::sum));
    }
}
