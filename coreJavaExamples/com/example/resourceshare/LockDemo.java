package com.example.resourceshare;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo  implements Runnable{
	
	int i=10;
	Lock lock=new ReentrantLock(true);
	
	public static void main(String[] args) {
		new LockDemo();
	}
	
	public LockDemo() {
		
		new Thread(this).start();
		new Thread(this).start();
	}
	
	public void run() {
		display();
	}
	
	private void display(){
		lock.lock();
			System.out.println(i);
			i++;
		lock.unlock();
	}

}
