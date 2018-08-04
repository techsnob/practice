package com.techsnob.interviews;

import java.util.Arrays;

public class ArrayIndexOOExcepton {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		Arrays.sort(numbers);

		int count = Math.min(3, numbers.length);
		for (int i = 0; i < count; i++) {
			System.out.println(numbers[i + numbers.length - 3]);
		}

	}
}
