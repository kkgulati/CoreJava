package com.example.varargs;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sum(2,3);
		sum(2,3,5,6,7);
		sum(2,3,3);
		sum(2,3,67,7);
		sum(10L,20L);
		sum("A","B");
	}
	
	private <T> void sum(T... a){
		System.out.println("In sum(T... a)");
	}
	
	private void sum(long a,long b){
		System.out.println("In sum(long a,long b)");
		System.out.println(a+b);
	}
	
	private void sum(int a,int b){
		System.out.println("In sum(int a,int b)");
		System.out.println(a+b);
	}
	
	private void sum(int... a){
		System.out.println("In sum(int... a)");
		int rs=0;
		for(int v : a){
			rs=rs+v;
		}
		System.out.printf("Result is %d%n",rs);
	}
}
