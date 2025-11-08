package _java8_streamAPI_CodingQuestion;

import java.util.Collections;
import java.util.List;

public class j_SortDescending {

    public static void main(String[] args) {
        List<Integer> myList = List.of(10, 15, 8, 45, 25, 98, 32, 12, 15);

        myList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        //myList.stream().sorted((a,b)-> Integer.compareTo(b,a)).forEach(System.out::println);
        /**
         * What is wrong here ??
         */
    }
}
