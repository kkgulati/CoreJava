package com.example.formatter;

public class Main {
	
	public static void main(String[] args) {
		
		String name="Mohan";
		int age=35;
		
		//Java 4
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);

		//Java 5
		System.out.printf("Your Name is %s.%n",name);
		System.out.printf("Your Age is %d.%n",age);

		System.out.printf("Your Name is %s and Your Age is %d.%n",name,age);
		
		
	}

}
