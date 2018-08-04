package com.techsnob.threads;

class Shared{
	void method1(){
		method2();
	}
	
	void method2(){
		method1();
	}
}
public class DeadLock {

	public static void main(String[] args) {
		Shared s = new Shared();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				s.method1();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				s.method2();
			}
		};
		
		t1.start();
		t2.start();
	}

}
