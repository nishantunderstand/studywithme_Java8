package _java8_L2_lambdaExp;

import java.util.function.Consumer;

public class ConsumerInter {

	public static void main(String[] args) {
		
		Consumer<String> length = n -> System.out.println("Lenght of '"+n+ "' is "+ n.length());
		
		length.accept("myname");
		
		
		Consumer<String> upper = s -> System.out.print(s.toUpperCase() + " ");
		Consumer<String> exclaim = s -> System.out.println("!");

		upper.andThen(exclaim).accept("lambda");
	}

}
