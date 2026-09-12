package java8_streamAPI_2_Interview;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Capgemini_20260912_3_NotAsked {
    public static void main(String[] args) {

        int[] arr1 = {10, 11, 12};
        int[] arr2 = {10, 11, 12};

//        IntStream result = IntStream.concat(
//                Arrays.stream(arr1),
//                Arrays.stream(arr2)
//        ).forEach(System.out::println);

        IntStream result = IntStream.concat(
                Arrays.stream(arr1),
                Arrays.stream(arr2)
        );

        result.forEach(System.out::println);

    }
}
