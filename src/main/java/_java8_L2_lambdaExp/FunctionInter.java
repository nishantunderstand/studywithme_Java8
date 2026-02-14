package _java8_L2_lambdaExp;

import java.util.function.Function;

public class FunctionInter {

	public static void main(String[] args) {

		String str = "myname";
		Function<String, Integer> fun = n -> n.length();
		System.out.println("Lenght of String '"+str+"' is "+fun.apply(str));
		
		Function<Integer, Integer> doubleIt = n -> n * 2;
		Function<Integer, Integer> squareIt = n -> n * n;

		Function<Integer, Integer> composed = doubleIt.andThen(squareIt); // (n*2)^2
		System.out.println(composed.apply(3));
	}

}
