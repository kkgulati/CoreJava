package com.example.enumex;

public enum Calculator {
	PLUS {public int op(int a,int b){ return a+b; }},
	MINUS{public int op(int a,int b){ return a-b; }};
	public abstract int op(int a,int b);
}

