package _java8_L4_beforeadv;

import java.util.stream.Stream;

public class Maptoprimitive {

	public static void main(String[] args) {

		int sum  = Stream.of(1,2,3,4,5).mapToInt(Integer:: intValue).sum();
		System.out.println(sum);
		
		double val  = Stream.of(1,2,3,4,5).mapToInt(Integer::intValue).average().getAsDouble();//.mapToInt(Integer:: intValue).sum();
		System.out.println(val);

	}

}
