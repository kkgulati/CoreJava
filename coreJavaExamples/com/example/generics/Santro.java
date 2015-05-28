package com.example.generics;

public class Santro extends Car implements Brakeable,Acceleratable{

	public String toString() {
		return "Santro Car";
	}

	public void brake() {
		System.out.println("Santro is speeding down...");
	}

	
	public void accelerate() {
		System.out.println("Santro is speeding up...");
	}
	
}
