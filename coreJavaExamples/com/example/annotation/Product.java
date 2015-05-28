package com.example.annotation;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Product  implements Serializable{
	
	@Deprecated
	public void display(){
		System.out.println("Product display.....");
	}
	
	public void show(){
		System.out.println("Product show.....");
	}
}
