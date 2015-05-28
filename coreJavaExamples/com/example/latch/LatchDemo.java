package com.example.latch;

import java.util.concurrent.CountDownLatch;

public class LatchDemo {
	
	public static void main(String[] args) {
		new LatchDemo();
	}
	
	public LatchDemo() {
	
		CountDownLatch startSignal=new CountDownLatch(1);
		CountDownLatch finishSignal=new CountDownLatch(5);
		
		HeavyWeightWork weightWork=new HeavyWeightWork(startSignal,finishSignal);
		
		new Thread(weightWork).start();
		new Thread(weightWork).start();
		new Thread(weightWork).start();
		new Thread(weightWork).start();
		new Thread(weightWork).start();
		
		
		System.out.println("Coordinating thread collecting input to give to workers...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//10 loc
		startSignal.countDown();
		try {
			System.out.println("Coordinator is waiting to get individual result from workers..");
			finishSignal.await();
			System.out.println("Coordinator got individual result from workers for further calculations..");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class HeavyWeightWork implements Runnable{

	CountDownLatch startSignal;
	CountDownLatch finishSignal;
	
	
	public HeavyWeightWork(CountDownLatch startSignal,CountDownLatch finishSignal) {
		this.startSignal =startSignal; 
		this.finishSignal = finishSignal;
	}
	
	public void run() {
		try {
			System.out.println("Waiting to get input from coordinator...");
			startSignal.await();
			System.out.println("Got input and doing the work....");
			//20 loc
			finishSignal.countDown();
			System.out.println("Finished the work!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
