package com.techsnob.practice;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DecimalBasedSort {

	/**
	 * Complete the function below. DONOT MODIFY anything outside this function!
	 */
	static int[] rearrange(int[] elements) {
		int result[] = new int[elements.length];
		if (elements.length >= 1 && elements.length <= 100000) {
			Map<Integer, StringBuilder> binaryValues = new HashMap<Integer, StringBuilder>(elements.length);
			for (int i = 0; i < elements.length; i++) {
				StringBuilder sb = new StringBuilder();
				while (elements[i] > 0) {
					binaryValues.put(elements[i], sb.append(elements[i] % 2));
					elements[i] = elements[i] / 2;
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

		int n = 0;
		n = Integer.parseInt(in.nextLine().trim());
		int[] elements = new int[n];
		int element;
		for (int i = 0; i < n; i++) {
			element = Integer.parseInt(in.nextLine().trim());
			elements[i] = element;
		}

		// call rearrange function
		int[] results = rearrange(elements);

		for (int i = 0; i < results.length; i++) {
			System.out.println(String.valueOf(results[i]));
		}
	}
}
