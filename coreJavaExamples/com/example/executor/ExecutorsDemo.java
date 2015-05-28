package com.example.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsDemo {

	public static void main(String[] args) {

		//ThreadPoolExecutor executor=new ThreadPoolExecutor(4,4,0L,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
		//ThreadPoolExecutor executor=new ThreadPoolExecutor(0,Integer.MAX_VALUE,60L,TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
		//ThreadPoolExecutor executor=new ThreadPoolExecutor(1,1,0L,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
		
		//Executor executor=Executors.newFixedThreadPool(4);
		//Executor executor=Executors.newCachedThreadPool();
		//Executor executor=Executors.newSingleThreadExecutor();
		
		ScheduledExecutorService executor=Executors.newScheduledThreadPool(1);
		
		PrintTask task=new PrintTask();
		
		executor.schedule(task,5L,TimeUnit.SECONDS);
		
	}
}
