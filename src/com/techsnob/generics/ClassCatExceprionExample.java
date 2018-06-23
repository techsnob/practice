package com.techsnob.generics;

import java.util.ArrayList;

public class ClassCatExceprionExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		 
        list.add("JAVA");
 
//        list.add(123);       Compile time error
 
        for (String str : list)
        {
            //No type casting needed. ClasscastException Never occurs
 
            System.out.println(str);
        }

	}

}
