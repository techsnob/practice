package com.techsnob.practice;

class Super {
	int i=10;
	public void display() { System.out.println("superdispaly"); }
	public void print() { System.out.println("superprint"); }
}

public class Sub extends Super{
	int i = 20;
	public void display() { System.out.println("subdisplay"); }
	public void hide() { System.out.println("subhide"); }
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.display();
		sub.print(); //sub class can access super class methods with sub class reference
		sub.hide(); System.out.println(sub.i);		System.out.println("");
		
		Super sup = new Sub();
		sup.display();
		sup.print();
		System.out.println(sup.i);
//		sup.hide(); //Super class reference cannot access sub class methods which are not overridden
		
		System.out.println("");
		
		/*Sub class reference cannot be created to Super class -> ClasscastException*/
		/*Sub sup1 = (Sub) new Super();
		sup1.display();
		sup1.print();*/
	}

}
