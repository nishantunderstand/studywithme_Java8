package _java8_L2_lambdaExp;

import java.util.function.Predicate;

public class TwoPredicate {

	public static void main(String[] args) {
		
		int num = 8;
		Predicate<Integer> greaterPredicate = n -> n > 5;
		Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		
		System.out.println("Is number : "+num+ " > 5 and even number ?\nAns: "+greaterPredicate.and(evenPredicate).test(num));

	}

}
