package com.example.executor;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.swing.text.TabableView;

public class ScheduledPoolDemo {

	public static void main(String[] args) {

		ScheduledThreadPoolExecutor executor=new ScheduledThreadPoolExecutor(2); 
		
		EchoTask echoTask1=new EchoTask("Hello");
		EchoTask echoTask2=new EchoTask("Hi");

		//executor.schedule(echoTask, 5L, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(echoTask1,5L,2L,TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(echoTask2,8L,3L,TimeUnit.SECONDS);
		
	}
}

class EchoTask implements Runnable {
	
	String name;
	
	public EchoTask(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.printf("Echoing...%s.....%n",this.name);
	}

}
