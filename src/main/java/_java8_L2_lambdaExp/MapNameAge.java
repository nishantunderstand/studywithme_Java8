package _java8_L2_lambdaExp;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapNameAge {

    public static void main(String[] args) {

        Map<String, Integer> mapNameAge = Map.of("one", 20, "two", 30, "three", 40, "four", 50);

        List<Entry<String, Integer>> list = mapNameAge.entrySet().stream().filter(n -> n.getValue() > 20).collect(Collectors.toList());

        List<String> strList = list.stream().map(n -> n.getKey()).collect(Collectors.toList());

        System.out.println(strList);

    }

}
