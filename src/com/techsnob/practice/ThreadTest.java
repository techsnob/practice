package com.techsnob.practice;

public class ThreadTest extends Thread {

	private boolean stop = false;
	private int count = 2147483647;
	byte b = 127;

	public void run() {
//		System.out.println("Thread started ");
		while (!stop) {
			count++;
			if(count > 0) {
				System.out.println(count);
			}
		}
	}

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		t.start();
//		System.out.println(t.count);
	}

}
