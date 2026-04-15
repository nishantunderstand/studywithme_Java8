package _java8_L2_lambdaExp;

import java.util.function.Predicate;

public class OddNumber {

	public static void main(String[] args) {

		int num = 6; 
		Predicate<Integer> nPredicate = n -> n%2!=0;
		System.out.println("Is no. "+num+" odd?\nAns: "+nPredicate.test(num));
		
	}

}
