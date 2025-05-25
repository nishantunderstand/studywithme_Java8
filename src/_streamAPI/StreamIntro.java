package _streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sunday, May 25, 2025 11:08:50 AM
 * 
 * List 
 * 
 * Types of List :
 * 
 * Types of List (Based on Mutablity) :
 * 
 * 1. Immutable
 * List.of
 * Arrays.asList
 * 
 * 2. Mutable 
 * new ArrayList<>()
 * 
 * 
 */

public class StreamIntro {
	public static void main(String[] args) {
		// How to Declare List ?
		List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67); // UnModifiable List
		// list1.add(20); // java.lang.UnsupportedOperationException
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(12);
		list2.add(22);
		list2.add(32);
		list2.add(42);
		System.out.println(list2); // Modifable List
		
		List<Integer> list3 = Arrays.asList(23,567,12,677,24); // UnModifable List
		System.out.println(list3);
		
		

	}
}
