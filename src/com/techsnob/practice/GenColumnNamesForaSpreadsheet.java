package com.techsnob.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenColumnNamesForaSpreadsheet {

	static List<String> columnNames(int n) {
		List<String> result = new ArrayList<String>();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				result.add(String.valueOf((char) ('A' + i / 26)) + String.valueOf((char) ('A' + i % 26)));
			}
		}
		return result;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int _columns = Integer.parseInt(in.nextLine().trim());

		List<String> result = columnNames(_columns);

		System.out.println(String.join(", ", result));
	}

}

/*
 * 
 * String s = Integer.toString(i, 26); char[] characters = s.toCharArray();
 * String result1 = ""; for(char c : characters){ int x =
 * Integer.parseInt(Character.valueOf(c).toString(), 26); result1 +=
 * String.valueOf((char)(x + 'A')); } result.add(result1) ;
 */
