package java8_L4_intermediate;

import java.util.Arrays;
import java.util.List;

public class FindStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "B", "C", "D");
		
		System.out.println("First: "+list.stream().findFirst().get());
		System.out.println("Any: "+list.stream().findAny().get());

	}

}
