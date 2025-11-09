package _lambda100;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class d_Template {
  public static void main(String[] args) {
    List<String> list1 = Arrays.asList("Java", "Lambda", "Kafka");

    System.out.println("======  Collection Framework  ======");
    Collections.sort(list1);
    System.out.println(list1);

    System.out.println("======  Stream InBuild Method Applied  ======");
    list1.stream().sorted().forEach(System.out::println);
    System.out.println(list1);

    System.out.println("====== By Using Lambda ASCENDING  ======");
    list1.sort((a, b) -> a.compareTo(b));
    list1.sort(String::compareTo);
    System.out.println(list1);


    System.out.println("====== By Using Lambda DESCENDING  ======");
    list1.sort((a, b) -> b.compareTo(a));
    System.out.println(list1);
  }
}


/*
compareTo() : Defines natural ordering (Comparable)
compare()   : Used for custom ordering (Comparator)
*/