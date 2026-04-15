package _java8_L2_lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		System.out.println(list.stream().map(n -> n*n).collect(Collectors.toList()));//.forEach(System.out::println);
		

	}

}
