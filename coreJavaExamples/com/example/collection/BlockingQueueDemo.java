package com.example.collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {
	
	public static void main(String[] args) {
		
		//BlockingQueue<String> blockingQueue=new ArrayBlockingQueue<String>(4,true);
		BlockingQueue<String> blockingQueue=new LinkedBlockingQueue<String>();
		
		
		try {
			blockingQueue.put("A");
			blockingQueue.put("B");
			blockingQueue.put("C");
			blockingQueue.put("D");
			blockingQueue.put("E");

			System.out.println(blockingQueue);
			
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
