package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardUse {
	
	public static void main(String[] args) {
		/*
		Object o1=new Object();
		Integer i=new Integer(34);
		Object o2=i;
		
		System.out.println(o2);
		
		List<Object> objects=new ArrayList<Object>();
		objects.add(new Object());
		objects.add(new Integer(100));
		objects.add(new String("Hello"));
		
		System.out.println(objects);
		Integer x=(Integer)objects.get(1);
		*/
		
		List<? super Number> objects1=null;
		List<Object> objects2=new ArrayList<Object>();		
		
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(new Integer(200));
		integers.add(new Integer(700));
		integers.add(new Integer(500));
		
		System.out.println(integers);
		
		List<String> strings=new ArrayList<String>();	
		strings.add("A");
		strings.add("B");
		strings.add("X");
		
		System.out.println(strings);
		
		//objects=integers;
		objects1=objects2;
		
		
		
	}

}
