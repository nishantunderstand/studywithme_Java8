package _java8_L2_lambdaExp;

import java.util.Optional;

public class OptionalStr {

	public static void main(String[] args) {
		
		
		String str = "";
		Optional.ofNullable(str).ifPresent(System.out::println);
		
	}

}
