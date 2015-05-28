package com.example.executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newFixedThreadPool(4);
		
		Collection<Future<Long>> futures=new ArrayList<Future<Long>>();
		
		for(int i=0;i<10;i++){
			CalcTask task=new CalcTask();
			Future<Long> future=executorService.submit(task);
			futures.add(future);
		}
		
		for(Future<Long> future : futures){
			try {
			
					boolean status=future.cancel(true);
					if(status){
						System.out.println("Cancelled");
					}else{
						long rs=future.get();
						System.out.printf("Result : %d%n",rs);
					}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}catch (CancellationException e) {
				e.printStackTrace();
			}
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated()){
		}
		
	}
}

class CalcTask implements Callable<Long>{
	
	public Long call() throws Exception {
		long rs=0L;
		for(long i=1;i<10000;i++){
			rs=rs+i;
		}
		return rs;
	}

	
	
}
