package com.sinu;

public class MyThread extends Thread{
	
	@Override
	public void run() {
	
		for(char i=65; i<68;i++) {
			
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
	}

}
