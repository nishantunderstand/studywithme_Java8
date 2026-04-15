package _java8_L4_intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
				
				System.out.println(list.stream().collect(Collectors.groupingBy(n-> n%2==0)));
	}

}
