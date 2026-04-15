package java8_L2_lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithS {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("one","two","Sthree","sfour","Sfive");
		List<String> newlist = list.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());
		
		System.out.println(newlist);
		
	}

}
