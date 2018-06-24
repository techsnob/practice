package com.techsnob.threads;

public class ThreadExample {
	public static void main (String[] args) {
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(Thread.currentThread().getName());
	}
}
