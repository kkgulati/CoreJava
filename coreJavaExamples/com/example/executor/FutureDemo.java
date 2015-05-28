package com.example.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

	public static void main(String[] args) {
				
		ExecutorService executor=Executors.newFixedThreadPool(1);
		SumTask task=new SumTask();
		
		Future future=executor.submit(task);

		boolean status=future.cancel(false);
		System.out.println(status);
		
		if(future.isCancelled()){
			System.out.println("Cancelled");
		}else{
			System.out.println("Not Cancelled");
		}
		
	}
}

class SumTask implements Runnable{
	
	public void run() {
		System.out.println("Sum : "+(10+20+30));		
	}
}