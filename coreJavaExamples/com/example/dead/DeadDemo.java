package com.example.dead;

public class DeadDemo implements Runnable{

	String resourceA="Pen";
	String resourceB="Notepad";
	
	public static void main(String[] args) {
		new DeadDemo();
	}
	
	Thread threadA,threadB=null;
	
	public DeadDemo() {
		threadA=new Thread(this);
		threadB=new Thread(this);
		threadA.start();
		threadB.start();
	}
	
	
	public void run() {
		if(Thread.currentThread() == threadA){
			synchronized (resourceA) {
				System.out.println("Pen is taken by ThreadA!");
				synchronized (resourceB) {
					System.out.println("Notepad is taken by ThreadA!");
				}
			}
		}
		if(Thread.currentThread() == threadB){
			synchronized (resourceB) {
				System.out.println("Notepad is taken by ThreadB!");
				synchronized (resourceA) {
					System.out.println("Pen is taken by ThreadB!");
				}
			}
		}
	}
}
