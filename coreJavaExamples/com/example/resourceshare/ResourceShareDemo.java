package com.example.resourceshare;

public class ResourceShareDemo  implements Runnable{
	
	int i=10;
	
	public static void main(String[] args) {
		new ResourceShareDemo();
	}
	
	public ResourceShareDemo() {
		
		new Thread(this).start();
		new Thread(this).start();
	}
	
	public void run() {
		display();
	}
	
	private synchronized void display(){
		System.out.println(i);
		i++;
	}

}
