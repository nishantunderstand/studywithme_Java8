package java8_L1_StreamStart;

import java.util.Arrays;
import java.util.List;

public class StreamProofLazy_2_Proof {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.stream().filter(n -> {
            System.out.println("no. is " + n);
            return n % 2 == 0;
        }).forEach(System.out::println);
    }
}
// Sunday, September 6, 2026 3:48:17 PM
// IDK What i am doing as of now ?
// What are you doing right now is correct ?

// Monday, September 14, 2026 3:36:23 PM
// https://www.instagram.com/p/DdPDDNHsqfw
// Thanks Chetan for Creating this.