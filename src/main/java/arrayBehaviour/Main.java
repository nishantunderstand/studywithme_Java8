package arrayBehaviour;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created : 2026-08-09 12:25:47
 */
public class Main {
    public static void main(String[] args) {
        Integer[] ar1 ={1,2,3};
        Integer[] ar2 ={4,5,6};

        /*Stream<Integer> result = IntStream.concat((IntStream) Arrays.stream(ar1), (IntStream) Arrays.stream(ar2));
        Stream<Integer> result1 = IntStream.concat(Arrays.stream(ar1), Arrays.stream(ar2));
        */

        Integer[] result = Stream.concat(Arrays.stream(ar1),Arrays.stream(ar2)).toArray(Integer[]::new);
        System.out.println(Arrays.toString(result));
    }
}