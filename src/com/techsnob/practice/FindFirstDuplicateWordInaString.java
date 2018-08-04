package com.techsnob.practice;

public class FindFirstDuplicateWordInaString {
	public static void main(String[] args) {
		String s = "This is me this is me";
		String[] strs = s.split(" ");
		
		for (int i = 0; i < strs.length; i++) {
			for (int j = i+1; j < strs.length; j++) {
				if(strs[i].equalsIgnoreCase(strs[j])) {
					System.out.println("First repeated word:"+strs[i]);
					return;
				}
			}
		}
		
	}
}
