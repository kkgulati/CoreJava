package com.example.enumex;

public enum CEO {
	ins("Rohan",45);
	
	String name;
	int age;
	
	private CEO(){
		System.out.println("In CEO()");
		this.name ="Raj";
		this.age = 34;
	}
	
	private CEO(String name,int age){
		System.out.println("In CEO(String name,int age)");
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails(){
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
	
}
