package java8_Interview;


import java.util.stream.Stream;

// Wednesday, April 15, 2026 9:01:11 PM
public class a_Deloite_1 {

    public static void main(String[] args) {
        // FibSeries by Stream

        Stream.iterate(
                new int[]{0,1},
                arr -> new int[]{arr[1],arr[0]+arr[1]}
        ).limit(10).map(arr->arr[0]).forEach(System.out::println);

    }
}