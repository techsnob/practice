package com.techsnob.interviews;

import java.util.Arrays;

public class SortZeroesToRight {

	public static void main(String[] args) {/*
											 * int[] arr = { 5, 6, 0, 2, 0, 0, 4, 0, 8, 9 };
											 * 
											 * int pos = arr.length - 1; if (pos != 0) { for (int i = 0; i < arr.length;
											 * i++) { if (arr[i] == 0) { arr[pos++] } } }
											 */
//		String[] s = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC" };
		/*
		 * for (int i = 0; i < s.length; i++) { for (int j = i+1; j < s.length; j++) {
		 * if(s[i].equals(s[j]) && i!=j) { System.out.println("Duplicate: "+ s[j]); } }
		 * }
		 */
		/*HashSet<String> hs = new HashSet<>();
		for (String string : s) {
			if (!hs.add(string)) {
				System.out.println("Duplicate: " + string);
			}
		}*/
		
		/*int[] i = new int[]{4, 5, 8, 7, 4, 7, 6,7};
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int j : i) {
			if (m.containsKey(j)) {
				m.put(j, m.get(j) + 1);
			} else {
				m.put(j, 1);
			}
		}*/
		
		int[] ints = new int[] {12, 0, 7, 0, 8, 0, 3};
		/*int count =0;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i]!=0) {
				ints[count] = ints[i];
				count++;
			}
		}
		
		for (int i = count; i < ints.length; i++) {
			ints[i] = 0;
		}*/
		
		System.out.println("Input Array After moving zeros to end :");
        System.out.println(Arrays.toString(ints));
        System.out.println("======================================");
        
        int count1=ints.length-1;
        for (int i = ints.length; i >= 0; i--) {
        	if (ints[i]!=0) {
				ints[count1] = ints[i];
				count1--;
			}
		}
        
        while(count1 >=0 ) {
        	ints[count1]=0;
        	count1--;
        }
        
        System.out.println("Input Array After moving zeros to start :");
        System.out.println(Arrays.toString(ints));
        System.out.println("======================================");
        
	}

}
