package java8_L4_intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Aman","Ria","Ankit","Vivek");
		
		//1st way
		System.out.println(list.stream().collect(Collectors.partitioningBy(n -> n.startsWith("A"))));
		
		//2nd way as you prefer
		Map<Boolean, List<String>> map = list.stream().collect(Collectors.partitioningBy(n -> n.startsWith("A")));
		System.out.println(map);

	}

}
