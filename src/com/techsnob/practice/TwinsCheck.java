package com.techsnob.practice;

import java.io.IOException;
import java.util.Scanner;

public class TwinsCheck {

	/**
	 * Complete the function below. DO NOT MODIFY anything outside this method.
	 */
	static boolean[] twins(String[] a, String[] b) {
		boolean[] result = new boolean[a.length];
		if (a.length >= 1 && a.length <= 100 && b.length >= 1 && b.length <= 100) {
			if (a.length == b.length) {
				for (int i = 0; i < a.length; i++) {
					if (a[i].length() == b[i].length()) {
						char y[] = b[i].toCharArray();
						for (int j = 0; j < y.length; j++) {
							if (j % 2 == 0 && j < y.length -2) {
								char temp = y[j];
								y[j] = y[j+2];
								y[j+2] = temp;
							} else if(j < y.length -2){
								char temp = y[j];
								y[j] = y[j+2];
								y[j+2] = temp;
							}
						}
						b[i] = new String(y);
					}
					if(a[i].equals(b[i])) {
						result[i] = true;
					}
				}
			}
		}
		return result;
	}

	/**
	 * DO NOT MODIFY THIS METHOD!
	 */
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine().trim());
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextLine();
		}

		int m = Integer.parseInt(in.nextLine().trim());
		String[] b = new String[m];
		for (int i = 0; i < m; i++) {
			b[i] = in.nextLine();
		}

		// call twins function
		boolean[] results = twins(a, b);

		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i] ? "Yes" : "No");
		}
	}
}
