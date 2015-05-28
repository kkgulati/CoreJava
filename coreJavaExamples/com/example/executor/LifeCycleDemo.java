package com.example.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LifeCycleDemo {

	public static void main(String[] args) {

		
		ExecutorService executor=Executors.newFixedThreadPool(4);
		PrintTask task=new PrintTask();
		
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		
		System.out.println("Before Shutdown!");
		executor.shutdown();
		System.out.println("After Shutdown!");
		
		while(!executor.isTerminated()){
		}
		System.out.println("Done!");
		
		
	}
}
