package _java8_L4_intermediate;

import java.util.Arrays;
import java.util.List;

public class DistinctLIst {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		
		System.out.println("Count of distinct values: "+list.stream().distinct().count());

	}

}
