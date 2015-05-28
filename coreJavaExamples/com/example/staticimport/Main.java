package com.example.staticimport;

import static java.lang.System.*;
import static java.lang.Thread.*;

public class Main {
	
	public static void main(String[] args) {
	
		out.println("Hello");
		out.println("Hi");
		out.println("Bye");
		
		Thread thread=new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Running....");
				
			}
		});
		
		//int MAX_PRIORITY=20;
		
		thread.setPriority(MAX_PRIORITY);
		thread.start();
			
	}

}
