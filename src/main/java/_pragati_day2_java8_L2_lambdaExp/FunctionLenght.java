package java8_L2_lambdaExp;

import java.util.function.Function;

public class FunctionLenght {

	public static void main(String[] args) {
		
		String str = "myname";
		System.out.println("Lenght of '"+str+"' is "+ ((Function<String, Integer>)(n -> n.length())).apply(str));

	}

}
