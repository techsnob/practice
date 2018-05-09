package com.techsnob.practice;

class Test {
	public static void print () {
		System.out.println("hello");
	}
}
public class TrickyOutputQuestion {

	public static void main(String[] args) {
		execute(null);
	}
	public static void execute(Test obj) {
		obj.print();
	}

}
