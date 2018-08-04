package com.techsnob.patterns;

import java.util.Scanner;

/**
 * @author nari
 * Print the below pattern
 1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
 *
 */
public class PrintIRepeatedncrementedValueInEachLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		sc.close();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}

}
