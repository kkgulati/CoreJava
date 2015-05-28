package com.example.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyListDemo {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		//Thread1
		Iterator<String> itr=list.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		//Thread2
		list.remove("C");
		
		//Thread1
		System.out.println(itr.next());
	}

}
