package com.techsnob.practice;


class Super1 {
	
	static {
		System.out.println("Super class static block");
	}
	
	{
		System.out.println("Super class initialization block");
	}
	
	Super1(){
		System.out.println("Super constructor");
	}
	
	public void display() {
		System.out.println("superdispaly");
	}
	
	public void print() {
		System.out.println("superprint");
	}
	
}
public class StaticVsInitVsConstr extends Super1{
	
	static {
		System.out.println("Sub class static block");
	}
	
	{
		System.out.println("Sub class initialization block");
	}
	
	StaticVsInitVsConstr(){
		System.out.println("Sub constructor");
	}
	
	public void display() {
		System.out.println("subdisplay");
	}
	
	public void hide() {
		System.out.println("subhide");
	}
	
	public static void main(String[] args) {
		StaticVsInitVsConstr sub = new StaticVsInitVsConstr();
//		System.out.println();
//		StaticVsInitVsConstr sub1 = new StaticVsInitVsConstr();
	}

}
