package com.example.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
	
	public static void main(String[] args) {
		
		Semaphore semaphore=new Semaphore(1,true);
		
		PrintTask printTask=new PrintTask(semaphore);
		
		new Thread(printTask).start();
		new Thread(printTask).start();
		new Thread(printTask).start();
		
	}
}

class PrintTask implements Runnable{
	
	Semaphore semaphore;
	
	public PrintTask(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	public void run() {
		try {
			semaphore.acquire();
				System.out.println("Hello");
				System.out.println("Hi");
				System.out.println("Bye");
			semaphore.release();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
