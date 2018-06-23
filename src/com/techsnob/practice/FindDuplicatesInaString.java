package com.techsnob.practice;

public class FindDuplicatesInaString {
	public static void main(String[] args) {
		String s = "This is me this is me";
		String[] strs= s.split(" ");
		for (int i = 0; i < strs.length; i++) {
			int count = 0;
			for (int j = i+1; j < strs.length; j++) {
				if(strs[i].equalsIgnoreCase(strs[j])) {
					count++;
				}
			}
			System.out.println(strs[i]+""+count);
		}
	}
}
