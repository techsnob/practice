package com.techsnob.practice;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumbersinSpecificRange {

	public static void main(String[] args) {
		int nos[] = new int[500];
		Random r = new Random();
		IntStream i = r.ints(1000, 12500, 13500);
	}

}
