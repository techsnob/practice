package com.techsnob.patterns;

import java.util.Scanner;

/**
 * @author nari
 * Print the below pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
 *
 */
public class PrintSequenceInaLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		sc.close();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+ "");
			}
			System.out.println("");
		}
	}

}
