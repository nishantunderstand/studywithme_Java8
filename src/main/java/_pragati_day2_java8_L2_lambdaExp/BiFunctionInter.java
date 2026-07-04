package java8_L2_lambdaExp;

import java.util.function.BiFunction;

public class BiFunctionInter {

	public static void main(String[] args) {

		BiFunction<String,String,Integer> bifun = (a,b) -> a.concat(b).length();
		
		System.out.println(bifun.apply("my", "name"));
	}

}
