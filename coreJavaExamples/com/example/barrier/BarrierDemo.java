package com.example.barrier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class BarrierDemo {

	List<Long> results=Collections.synchronizedList(new ArrayList<Long>());
	
	public static void main(String[] args) {
		new BarrierDemo();
	}
	
	public BarrierDemo() {

		CyclicBarrier barrier = new CyclicBarrier(4, new BarAction());

		CalcTask subTask1 = new CalcTask(1, 100000, barrier);
		CalcTask subTask2 = new CalcTask(100001, 200000, barrier);
		CalcTask subTask3 = new CalcTask(200001, 300000, barrier);
		CalcTask subTask4 = new CalcTask(300001, 400000, barrier);

		new Thread(subTask1).start();
		new Thread(subTask2).start();
		new Thread(subTask3).start();
		new Thread(subTask4).start();

	}

	class BarAction implements Runnable {

		public void run() {
			System.out.println("Barrier Action Done!");
			long result=0L;
			for(Long val : results){
				result=result+val;
			}
			System.out.printf("Result : %d%n",result);
		}
	}

	class CalcTask implements Runnable {

		long start;
		long end;
		CyclicBarrier barrier;

		public CalcTask(long start, long end, CyclicBarrier barrier) {
			this.start = start;
			this.end = end;
			this.barrier = barrier;
		}

		public void run() {

			long rs = 0L;
			for (; start <= end; start++) {
				rs = rs + start;
			}
			try {
				System.out.println("On Barrier Point");
				results.add(rs);
				barrier.await(10L, TimeUnit.SECONDS);
				System.out.printf("Sub Result : %d%n", rs);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
				e.printStackTrace();
			}
		}
	}
}
