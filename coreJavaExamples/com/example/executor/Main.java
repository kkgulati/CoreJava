package com.example.executor;

import java.awt.Frame;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {

		//ThreadPoolExecutor executor=new ThreadPoolExecutor(4,4,0L,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
		//ThreadPoolExecutor executor=new ThreadPoolExecutor(0,Integer.MAX_VALUE,60L,TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
		ThreadPoolExecutor executor=new ThreadPoolExecutor(1,1,0L,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
		
		for(int i=0;i<20;i++){
			PrintTask task=new PrintTask();
			executor.execute(task);
		}
		
	}
}


