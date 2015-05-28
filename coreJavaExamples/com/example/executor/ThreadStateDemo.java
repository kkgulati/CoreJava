package com.example.executor;

import java.lang.Thread.State;

public class ThreadStateDemo {
	
	public static void main(String[] args) {
		
		Thread thread=new Thread(new Runnable() {
			public void run() {
				System.out.println("I am Done!");
				State state=Thread.currentThread().getState();
				System.out.println(state);
			}
		});
		
		State state=thread.getState();
		System.out.println(state);
		
		thread.start();
		
		state=thread.getState();
		System.out.println(state);
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		state=thread.getState();
		System.out.println(state);
	}

}
