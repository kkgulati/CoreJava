package com.example.pool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
		final ThreadPool threadPool=new ThreadPool(5);
		
		for(int i=1;i<=20;i++){
			HelloTask task=new HelloTask("Hello "+i);
			threadPool.submit(task);
		}
		
		JFrame frame=new JFrame("Task Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button=new JButton("Submit Task");
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			int count=21;
			public void actionPerformed(ActionEvent e) {
				HelloTask task=new HelloTask("Hello "+count);
				threadPool.submit(task);
				count++;
			}
		});
		frame.setSize(200,200);
		frame.setVisible(true);
		
	}
}

class ThreadPool{
	
	LinkedList<Runnable> taskQueue=new LinkedList<Runnable>();
	//Queue<Runnable> queue=new ConcurrentLinkedQueue<Runnable>();
	
	public ThreadPool(int size) {
		for(int i=1;i<=size;i++){
			Worker worker=new Worker(this,"Worker : "+i);
			worker.start();
		}
	}
	
	public void submit(Runnable task){
		synchronized(taskQueue){
			taskQueue.addLast(task);
			taskQueue.notifyAll();
		}
	}
	
	public Runnable getTask(){
		
		Runnable task=null;
		
		synchronized(taskQueue){
			while(taskQueue.isEmpty()){
				try {
					taskQueue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			task=taskQueue.removeFirst();
		}
		
		return task;
	}
}


class Worker extends Thread{
	
	ThreadPool threadPool;
	
	public Worker(ThreadPool threadPool,String name){
		super(name);
		this.threadPool =threadPool;
	}
	
	public void run() {
		while(true){
			Runnable task=threadPool.getTask();
			task.run();
		}
	}
}

class HelloTask implements Runnable{

	String name;
	
	public HelloTask(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.printf("This %s Task is executed by : %s Thread!%n",this.name,Thread.currentThread().getName());
	}
	
}