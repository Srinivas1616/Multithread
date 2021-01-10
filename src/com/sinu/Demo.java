package com.sinu;

public class Demo {

	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.run();
		
		System.out.println("Hello!!!" + Thread.currentThread().getName());
		
		
		System.err.println("hiiiii" + Thread.currentThread().getName());
		
	}
}
