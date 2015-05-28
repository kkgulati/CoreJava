package com.example.generics;

public class CarMechanic<T extends Car & Brakeable & Acceleratable> {
	
	T car;
	
	public CarMechanic(T car) {
		this.car = car;
	}
	
	public void run(){
		System.out.println(car.getColor());
		System.out.println(car+" is being tested....");
		car.brake();
		car.accelerate();
	}
	
	public T returnCar(){
		return this.car;
	}

}
