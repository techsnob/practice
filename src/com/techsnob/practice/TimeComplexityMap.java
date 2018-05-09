package com.techsnob.practice;

import java.util.HashMap;
import java.util.Map;

public class TimeComplexityMap {

	public static void main(String[] args) {
		Map<Key, Integer> m = new HashMap<>();
		
	}
	
	static class Key{
		public int hashcode() {
			return 42;
		}
	}

}
