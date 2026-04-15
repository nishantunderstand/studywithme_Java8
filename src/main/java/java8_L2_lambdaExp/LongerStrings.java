package java8_L2_lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongerStrings {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("one","two","three","four","five");
		
		List<String> newlist = list.stream().filter(n -> n.length() > 3).collect(Collectors.toList());
		
		System.out.println(newlist);

	}

}
