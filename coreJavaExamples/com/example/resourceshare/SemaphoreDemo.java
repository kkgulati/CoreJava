package com.example.resourceshare;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SemaphoreDemo  implements Runnable{
	
	int i=10;
	Semaphore semaphore=new Semaphore(1);
	
	public static void main(String[] args) {
		new SemaphoreDemo();
	}
	
	public SemaphoreDemo() {
		
		new Thread(this).start();
		new Thread(this).start();
	}
	
	public void run() {
		display();
	}
	
	private void display(){
		try {
			semaphore.acquire();
				System.out.println(i);
				i++;
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
