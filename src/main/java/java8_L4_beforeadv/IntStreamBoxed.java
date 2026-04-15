package java8_L4_beforeadv;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamBoxed {

	public static void main(String[] args) {
		
		System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));

	}

}
