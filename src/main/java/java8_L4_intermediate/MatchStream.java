package java8_L4_intermediate;

import java.util.Arrays;
import java.util.List;

public class MatchStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
		
		System.out.println("All even: "+list.stream().allMatch(n -> n %2 ==0));
		System.out.println("Any odd: "+list.stream().anyMatch(n -> n %2 !=0));
		System.out.println("No any zero Ryt?: "+list.stream().noneMatch(n -> n == 0));

	}

}
