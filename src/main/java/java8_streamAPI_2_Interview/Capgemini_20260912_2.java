package java8_streamAPI_2_Interview;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class Capgemini_20260912_2 {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        // List<Integer> -> IntStream
        // IntStream intStream = myList.stream().mapToInt(Integer::intValue);


        IntSummaryStatistics stats =
                myList.stream() // Stream<Integer>
                        .mapToInt(Integer::intValue) // IntStream
                        .summaryStatistics();

        System.out.println(": "+stats.getCount());
        System.out.println(": "+stats.getMax());
        System.out.println(": "+stats.getMin());
        System.out.println(": "+stats.getAverage());


    }
}
