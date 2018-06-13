package com.techsnob.exceptionhandling;

import com.techsnob.practice.Employee;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee(1, "", 1L);
		
		if(e.getName().equals("")) {
			try {
				throw new CustomException("Name should not be empty");
			} catch (CustomException e1) {
				e1.printStackTrace();
			}
		}
	}

}
