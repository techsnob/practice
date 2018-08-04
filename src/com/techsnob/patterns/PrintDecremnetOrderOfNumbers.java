package com.techsnob.patterns;

import java.util.Scanner;

/**
 * @author nari
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 *
 */
public class PrintDecremnetOrderOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		sc.close();
		
		for (int i = rows; i >=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
