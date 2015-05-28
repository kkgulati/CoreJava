package com.example.annotation;

import java.util.ArrayList;
import java.util.List;

public class Main {
		
	public static void main(String[] args) {
		
		HelloWorld helloWorld=new HelloWorld();
		helloWorld.hello();
		helloWorld.hi();
		helloWorld.bye();
		
		
		Product p=new Product();
		p.display();
		
		@SuppressWarnings("unused")
		int i=10;
		
		@SuppressWarnings({"rawtypes","unused"})
		List l=new ArrayList();
		
	}
	
	
}
