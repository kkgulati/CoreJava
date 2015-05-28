package com.example.enumex;

public class Person {

	String name;
	Month month;

	public Person(String name, Month month) {
		this.name = name;
		this.month = month;
	}

	public String getName() {
		return name;
	}

	public Month getMonth() {
		return month;
	}

	public String toString() {
		return "Person [name=" + name + ", month=" + month + "]";
	}

}
