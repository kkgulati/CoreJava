package com.example.generics;

public class BMW extends Car implements Brakeable,Acceleratable{

	
	public String toString() {
		return "BMW Car";
	}

	public void brake() {
		System.out.println("BMW is speeding down...");
	}

	public void accelerate() {
		System.out.println("BMW is speeding up...");
	}
	
}
