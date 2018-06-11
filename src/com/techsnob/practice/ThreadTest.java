package com.techsnob.practice;

public class ThreadTest implements Runnable {

	private boolean stop = false;
	private int count = 2147483647;
	byte b = 127;

	public void run() {
		System.out.println("Thread started ");
//		while (!stop) {
//			count++;
//			if(count > 0) {
//				System.out.println(count);
//			}
//		}
	}

	public static void main(String[] args) {
		
		ThreadTest t1 = new ThreadTest();
		Thread t = new Thread(t1);
//		t.start();
		t.run();
//		System.out.println(t.count);
	}

}
