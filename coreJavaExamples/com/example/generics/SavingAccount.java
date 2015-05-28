package com.example.generics;

public class SavingAccount extends Account{

	double withdrawLimit;
	
	public SavingAccount() {
		this.withdrawLimit = 25000.00;
	}
	
	public String toString() {
		return super.toString()+" SavingAccount [withdrawLimit=" + withdrawLimit + "]";
	}
	
}
