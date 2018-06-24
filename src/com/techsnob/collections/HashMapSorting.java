package com.techsnob.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.techsnob.practice.Employee;

public class HashMapSorting {

	public static void main(String[] args) {
		Map<Integer, Employee> emps = new HashMap<Integer,Employee>();
		emps.put(2, new Employee(2,"mary", 8650));
		emps.put(1, new Employee(1,"jack", 15400));
		emps.put(4, new Employee(4, "sarah", 54689));
		emps.put(3, new Employee(3,"doe",95400));
		
//		emps.forEach((k,e) -> System.out.println("key:"+k+" "+e.getName()));
		
		for(Integer key: emps.keySet()) {
			System.out.println(emps.get(key).getName());
		}
	}

}
