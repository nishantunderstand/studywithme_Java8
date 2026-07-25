package _java8_streamAPI_Question_JavaConceptOfDay_1;
import java.util.stream.IntStream;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class _Template {
    public static void main(String[] args) {
// 		19) How do you find sum of first 10 natural numbers?
        int sum = IntStream.range(1,11).sum();
        int sum1 = IntStream.rangeClosed(1,10).sum();

        System.out.println("Sum : "+ sum);


        // It can be solved by iterate or genrate as well.
        // can you guide me ??

        // 		20) Reverse an integer array





    }
}