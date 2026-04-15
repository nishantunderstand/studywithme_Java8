package java8_L2_lambdaExp;

import java.util.function.Predicate;

public class PredicateInter {

	public static void main(String[] args) {
		
		int num = 5;
		Predicate<Integer> isEven = n -> n%2 == 0;
		System.out.println("Is "+num+" is Even? \nAns: "+isEven.test(num));
		
	}

}
