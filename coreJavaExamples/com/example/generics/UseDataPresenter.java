package com.example.generics;

public class UseDataPresenter {
	
	public static void main(String[] args) {
		
		DataPresenter presenter=new DataPresenter();
		
		presenter.displayData("Watch",new Integer(10),"Electronic");
		
		presenter.displayData(new Double(12.00),new Integer(10),"Price");
		presenter.displayData(new Product("Laptop"),new Short("10"),"User Defined");
		
	}

}
