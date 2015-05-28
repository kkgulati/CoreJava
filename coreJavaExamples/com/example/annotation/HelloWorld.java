package com.example.annotation;

@Author(name="Ritesh",age=20)
public class HelloWorld {
	
	@Author(name="Raj",age=23)
	public void hello(){
		System.out.println("Hello....");
	}

	public void hi(){
		System.out.println("Hi....");
	}
	
	public void bye(){
		System.out.println("Bye....");
	}
}
