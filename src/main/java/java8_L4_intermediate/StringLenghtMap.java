package java8_L4_intermediate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringLenghtMap {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Apple", "Banana", "Cat");
		
		Map<String, Integer> map = new HashMap<>();
		
		list.stream().forEach(n -> map.put(n, n.length()));
		
		System.out.println(map);
		
		
		//System.out.println(list.stream().collect(Collectors.toMap(s -> s, String::length)));
		
		
	}

}
