package com.techsnob.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsPassbyValueOrReference {

	public static void main(String[] args) {
		List<Integer> ints=new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.forEach(i -> System.out.println(i));
		System.out.println("After method call:");
		changeMethod(ints);
		ints.forEach(i -> System.out.println(i));
	}
	
	static void changeMethod(List<Integer> i) {
		i.remove(1);
	}

}
