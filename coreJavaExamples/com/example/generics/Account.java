package com.example.generics;

public class Account {

	int id;
	double amount;
	char status;

	public Account() {
		this.id = (int)System.nanoTime();
		this.amount = 5000.00;
	}
	
	
	public Account(int id, double amount, char status) {
		this.id = id;
		this.amount = amount;
		this.status = status;
	}

	public Account(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String toString() {
		return "Account [id=" + id + ", amount=" + amount + ", status="
				+ status + "]";
	}

}
