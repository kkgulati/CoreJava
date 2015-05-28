package com.example.generics;

public class DataHolder<A,B> {

	A data;
	B count;
	
	public DataHolder(A data,B count) {
		this.data= data;
		this.count= count;
	}
	
	public A getData(){
		return this.data;
	}
	
	public B getCount(){
		return this.count;
	}
}
