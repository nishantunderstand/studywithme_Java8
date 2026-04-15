package java8_L3_beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		List<Integer> squareList = list.stream().map(n -> n*n).collect(Collectors.toList());
		System.out.println(squareList);
		//list.stream().map(n -> n*n).forEach(System.out::println);
				//.collect(Collectors.toList());
	}
}
