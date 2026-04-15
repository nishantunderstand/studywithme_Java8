package _java8_L4_intermediate;

import java.util.Arrays;
import java.util.List;

public class ReduceStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		
		System.out.println("Sum = "+list.stream().reduce(0,Integer::sum));

	}

}
