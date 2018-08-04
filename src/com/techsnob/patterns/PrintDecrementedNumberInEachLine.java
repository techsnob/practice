package com.techsnob.patterns;

import java.util.Scanner;

/**
 * @author nari
 *
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7
 */
public class PrintDecrementedNumberInEachLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		sc.close();
		
		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
