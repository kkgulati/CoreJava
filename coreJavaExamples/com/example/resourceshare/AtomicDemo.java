package com.example.resourceshare;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo  implements Runnable{
	
	AtomicInteger atomicInteger=new AtomicInteger(10);
	
	public static void main(String[] args) {
		new AtomicDemo();
	}
	
	public AtomicDemo() {
		
		new Thread(this).start();
		new Thread(this).start();
	}
	
	public void run() {
		display();
	}
	
	private void display(){
		System.out.println(atomicInteger.getAndIncrement());
	}

}
