package com.example.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadFactoryDemo {

	public static void main(String[] args) {

		//ThreadPoolExecutor executor=new ThreadPoolExecutor(4,4,0L,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(),new UserThreadFactory());
		Executor executor=Executors.newFixedThreadPool(4, new UserThreadFactory());
		
		for(int i=0;i<20;i++){
			PrintTask task=new PrintTask();
			executor.execute(task);
		}
		
	}
}

class UserThreadFactory implements ThreadFactory{

	public Thread newThread(Runnable r) {
		Thread t=new Thread(r);
		t.setName("UserThread");
		return t;
	}
	
	
	
}
