package com.techsnob.practice;

public class Sample {

	public static void main(String[] args) {
			int i = 26;
			
				do{
					if(i > 676) {
						
						i = i/26;
					}
				}while (i < 26);
				System.out.println(String.valueOf((char) ('A' + i % 26)));

	}

}
