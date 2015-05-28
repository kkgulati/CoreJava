package com.example.generics;

public class CurrentAccount extends Account{

	double odLimit;
	
	public CurrentAccount() {
		this.odLimit = 3000000.00;
	}
	
	public String toString() {
		return super.toString()+" CurrentAccount [odLimit=" + odLimit + "]";
	}
	
}
