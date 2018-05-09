package com.techsnob.practice;

public class ArithmeticOperations {
	public static void main(String[] args) {
		/*
		 * The first multiplication is performed in 32-bit precision, whereas the second
		 * multiplication is a long multiplication. The value -727379968 is the decimal
		 * value of the low 32 bits of the mathematical result, 1000000000000, which is
		 * a value too large for type int.
		 */
		int id = 1000000;
		System.out.println(id * id);
		long l = id;
		System.out.println(l * l);
//		System.out.println(20296 / (l - id));

		// An example of overflow:
		double d = 1e308;
		System.out.println("overflow produces infinity:"+d+ "*10 == " + d * 10);
		
		// An example of gradual underflow:
		d = 1e-305 * Math.PI;
		System.out.print("gradual underflow: " + d + "\n");
		for (int i = 0; i < 4; i++)
			System.out.println(d /= 100000);
		
		// An example of NaN:
		System.out.println("");
		d = 0.0 / 0.0;
		System.out.println("0.0/0.0 is Not-a-Number: "+d);
		
		// An example of inexact results and rounding:
        System.out.print("inexact results with float:");
        for (int i = 0; i < 100; i++) {
            float z = 1.0f / i;
            if (z * i != 1.0f)
                System.out.print(" " + i);
        }

	}
}
