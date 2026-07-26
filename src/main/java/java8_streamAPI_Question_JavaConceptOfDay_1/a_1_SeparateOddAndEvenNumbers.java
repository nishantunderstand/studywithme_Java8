package java8_streamAPI_Question_JavaConceptOfDay_1_PRAGATI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class a_1_SeparateOddAndEvenNumbers {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        System.out.println("====== Even ======");
        listOfIntegers.stream().filter(n->n%2==0).forEach(System.out::println);


        System.out.println("====== Odd ======");
        listOfIntegers.stream().filter(n->n%2==1).forEach(System.out::println);


        System.out.println("======  Mixed ======");



    }
}
