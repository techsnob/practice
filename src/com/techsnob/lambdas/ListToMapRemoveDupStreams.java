package com.techsnob.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.techsnob.practice.Employee;

public class DuplicatesInListStreams {

	public static void main(String[] args) {
//		Integer[] arr = { 1, 1, 3, 5, 7, 7, 8, 9 };
//		List<Integer> listWithDuplicates = Arrays.asList(arr);
//
//		List<Integer> listWithoutDuplicates = listWithDuplicates.stream().distinct().collect(Collectors.toList());
//		listWithoutDuplicates.forEach(a -> System.out.println(a));
		
		Employee[] employees = {new Employee(1, "A123", 5000), new Employee(2, "B123", 1000),
				new Employee(3,"C123",2000), new Employee(4,"C123",3000)};
		List<Employee> emps = Arrays.asList(employees);
		Map<String, Employee> diemps = emps.stream().distinct()
				.collect(Collectors.toMap(Employee::getName, Function.identity(), (e1,e2)-> e1.getName().compareTo(e2.getName()) > 0 ? e1:e2));
//		.forEach(e -> System.out.println(e.getName()));
//		Map<String, Employee> diemps = emps.stream().collect(Collectors.groupingBy(Employee::getName));
		diemps.forEach((k,e) -> System.out.println(k + " " + e.getName()));
	}

}
