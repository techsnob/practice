package com.techsnob.loops;

public class Triangle {
	public static void main(String[] args) {
		/*for (int i=1; i<10; i += 2)
		{
		    for (int k=0; k < (4 - i / 2); k++)
		    {
		        System.out.print(" ");
		    }
		    for (int j=0; j<i; j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println("");
		}*/
		
//		for (int i = 0; i < 5; i++) 
//			  System.out.println("    *********".substring(i, 5 + 2*i));
		
		 for (int i = 0; i < 5; i++) {

	            // print j periods
	            for (int j = 0; j < i; j++)
	                System.out.print(". ");

	            // print n-i asterisks
	            for (int j = 0; j < 5-i; j++)
	                System.out.print("* ");

	            // print a new line
	            System.out.println();
	        }
	}
}
