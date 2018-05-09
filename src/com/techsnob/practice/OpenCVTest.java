package com.techsnob.practice;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OpenCVTest implements Serializable {

	public static void main(String[] args) {
//		NamingContextExt 
//		List<String> ints = new ArrayList<>();
//		ints.add("X");
//		ints.addAll(new ArrayList<>());
//		System.out.println(ints);
		
		
		/*try {
			badM();
			System.out.println("a");
		} catch (Exception e) {
			System.out.println("b");
		}
		finally {
			System.out.println("c");
		}
		System.out.println("d");*/
		
		
		/*Object o = new Object();
		Object o1 = new Object();
		System.out.println(o == o1);
		System.out.println(o.equals(o1));
		o=o1;
		System.out.println(o.equals(o1));*/
		
		
		/*Set s = new HashSet(Arrays.asList(1,2,2,3,3,5));
		System.out.println(s.size());*/
		
		Thread t = new Thread();
	}
	public static void badM() {
		throw new RuntimeException();
	}

}
