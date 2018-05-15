package com.techsnob.practice;

import java.util.HashSet;
import java.util.Set;

public class SetDuplication {
	
	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<>();
		Employee e1 = new Employee(1,"Naresh", 10);
		Employee e2 = new Employee(2,"Ramesh", 10);
		Employee e3 = new Employee(1,"Naresh", 10);
		Employee e4 = new Employee(2,"Naresh", 10);
		Employee e5 = new Employee(3,"Naresh", 10);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		for (Employee e : employees) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
	}
}
