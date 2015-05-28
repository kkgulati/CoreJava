package com.example.boxing;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		//Java 4
		int i=10;
		Integer x=new Integer(i);
		System.out.println(i);
		System.out.println(x);
		
		int a=x.intValue();
		System.out.println(a);
		
		
		//Java 5
		int j=10;
		Integer y=j;
		System.out.println(j);
		System.out.println(y);
		
		int b=y;
		System.out.println(b);
		
		List list=new ArrayList();
		list.add(new Integer(100));
		list.add(100);
		
		int z=(Integer)list.get(1);
	}

}
