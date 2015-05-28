package com.example.procon;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Main {
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
	
		//BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<Integer>(10);
		//BlockingQueue<Integer> blockingQueue=new LinkedBlockingQueue<Integer>(10);
		BlockingQueue<Integer> blockingQueue=new SynchronousQueue<Integer>();
		
		Producer producer=new Producer(blockingQueue);
		Consumer consumer=new Consumer(blockingQueue);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}


class Producer implements Runnable{
	
	BlockingQueue<Integer> blockingQueue;
	
	public Producer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
	
	public void run() {
		while(true){
			try {
				blockingQueue.put((int)(Math.random()*100));
				System.out.println("Produced!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class Consumer implements Runnable{
	
	BlockingQueue<Integer> blockingQueue;
	
	public Consumer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
	
	public void run() {
		while(true){
			try {
				System.out.printf("Consumed : %d%n",blockingQueue.take());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}