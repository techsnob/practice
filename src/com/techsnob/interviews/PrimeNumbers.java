package com.techsnob.interviews;

public class PrimeNumbers {

	public static void main(String[] args) {
		int p;
		for (int i = 2; i < 100; i++) {
			p=0;
			for (int j = 2; j < i; j++) {
				if(i%j==0) 
					p=1;
			}
			if(p==0)
				System.out.println(i);
		}
	}
	
}
