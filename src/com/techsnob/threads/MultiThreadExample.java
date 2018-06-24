package com.techsnob.threads;

class Thread1 extends Thread{
	public void run() {
		for(int i = 0; i <= 1000; i++)
        {
            System.out.println(i);
        }
	}
}

class Thread2 implements Runnable{
	public void run() {
		for(int i = 1000; i <= 2000; i++)
        {
            System.out.println(i);
        }
	}
}

public class MultiThreadExample {
	public static void main(String[] args) {
		new Thread1().start();
		new Thread(new Thread2()).start();
	}
}
