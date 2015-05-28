package com.example.generics;

public class DataPresenter {

	public <A,B> A displayData(A data,B count,B type){
		System.out.println(data);
		System.out.println(count);
		System.out.println(type);
		return data;
	}
	
}
