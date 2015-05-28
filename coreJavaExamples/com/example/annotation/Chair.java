package com.example.annotation;

public class Chair extends Furniture{
	
	@Override
	public void doWork(){
		System.out.println("In Chair.doWork()");
	}

}
