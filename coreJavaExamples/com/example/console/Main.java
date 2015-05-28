package com.example.console;

import java.io.Console;

public class Main {
	
	public static void main(String[] args) {
	
		Console console=System.console();
		
		if(console!= null){
			System.out.println("Available");
			
			String name=console.readLine("Enter Your Name : \t");
			String pass=new String(console.readPassword("Enter Your Password : \t"));
			
			console.printf("Name is : %s%n",name);
			console.printf("Password is : %s%n",pass);
			
		}else{
			System.out.println("Not Available");
		}
		
	}

}
