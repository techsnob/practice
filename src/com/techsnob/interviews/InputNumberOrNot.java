package com.techsnob.interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumberOrNot {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println(Integer.parseInt(br.readLine()));
	}

}
