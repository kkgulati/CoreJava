package com.example.generics;

public class MethodOverLoadDemo {
	public static void main(String[] args) {
		new MethodOverLoadDemo();
	}
	
	public MethodOverLoadDemo() {
		this.<Integer,Integer>display(new Integer(100),new Integer(100));
		display(new Integer(100),new Integer(100));
	}
	
	private void display(Integer a,Integer b){
		System.out.println("display(Integer a,Integer b)");
		System.out.println(a+b);
	}
	
	
	public <A,B> void display(A a,B b){
		System.out.println("display(A a,B b)");
		System.out.println(a);
		System.out.println(b);
	}
	
	
}
