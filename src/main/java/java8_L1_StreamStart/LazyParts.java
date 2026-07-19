package java8_L1_StreamStart;

import java.util.Arrays;
import java.util.List;

public class LazyParts {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		list.stream().filter(n -> {
			System.out.println("no. is "+n);
			return n%2==0;}).forEach(System.out::println);
	}

}
