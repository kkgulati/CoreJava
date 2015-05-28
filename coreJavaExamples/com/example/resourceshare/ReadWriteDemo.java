package com.example.resourceshare;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteDemo implements Runnable{
	
	int i=10;
	ReadWriteLock readWriteLock=new ReentrantReadWriteLock(true);
	Lock readLock=readWriteLock.readLock();
	Lock writeLock=readWriteLock.writeLock();
	
	
	public static void main(String[] args) {
		
		new ReadWriteDemo();
	}
	
	Thread threadA,threadB,threadC,threadD,threadE=null;
	
	public ReadWriteDemo() {
		
		threadA=new Thread(this);
		threadB=new Thread(this);
		threadC=new Thread(this);
		threadD=new Thread(this);
		threadE=new Thread(this);
		
		threadA.start();
		threadB.start();
		threadC.start();
		threadD.start();
		threadE.start();
		
	}
	
	public void run() {
		if(Thread.currentThread() == threadA || Thread.currentThread() == threadB || Thread.currentThread() == threadC){
			read();
		}else if(Thread.currentThread() == threadD || Thread.currentThread() == threadE){
			write();
		}
	}
	
	private void read(){
		readLock.lock();
			System.out.println("Inside Read!");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		readLock.unlock();
	}

	private void write(){
		writeLock.lock();
			System.out.println("Inside Write!");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		writeLock.unlock();
	}
}
