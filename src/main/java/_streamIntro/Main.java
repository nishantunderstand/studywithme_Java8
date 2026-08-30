package _streamIntro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0,(a,b)-> a+b);
        // Does it int or Integer
        Integer product = numbers.stream().reduce(1,(a,b)-> a*b);
        System.out.println(sum);
    }
}
