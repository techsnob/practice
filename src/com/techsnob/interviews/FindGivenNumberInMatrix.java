package com.techsnob.interviews;

import java.util.Scanner;

public class FindGivenNumberInMatrix {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int item = Integer.parseInt(new Scanner(System.in).nextLine());
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 15, 16, 110, 121, 152, };
		
		int first = 0;
		int last = array.length - 1;
		int mid = first + last /2;
		
		while(first <= last) {
			if(array[mid] < item) {
				first = mid + 1;
			} else if(array[mid] == item) {
				System.out.println(item + " found at "+ (mid + 1));
				break;
			} else {
				last = mid -1;
			}
			mid = (first + last)/2;
		}
		
		if(first > last) {
			System.out.println(item + " is not found.\n");
		}
	}

}
