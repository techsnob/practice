package com.techsnob.practice;

import java.text.ParseException;

public class ThrowRandomException {
	
	public static void main(String[] args) {
		try {
			throw new ParseException("Cannot parse!", 1);
		} catch (NullPointerException e) {
			System.out.println("a");
		} catch (Exception e) {
			System.out.println("b");
		} finally {
			System.out.println("c");
		}
	}
}
