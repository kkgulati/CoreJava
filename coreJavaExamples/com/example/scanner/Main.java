package com.example.scanner;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		String input="Blue Color Yellow Color Green Color Black Color";

		Scanner scanner=new Scanner(input).useDelimiter("Color");

		while(scanner.hasNext()){
			String val=scanner.next();
			System.out.println(val);
		}
		
		/*
		Scanner scanner=new Scanner(System.in);
		
		System.out.printf("Enter your name : \t");
		String name=scanner.nextLine();
		
		System.out.printf("Enter your age : \t");
		int age=scanner.nextInt();
		
		System.out.printf("Your Name is %s.%n",name);
		System.out.printf("Your Age is %d.%n",age);
		 */
		
	}

}
