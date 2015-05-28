package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConModDemo {
	
	public static void main(String[] args) {
	
		List<String> strings=Collections.synchronizedList(new ArrayList<String>());
		strings.add("A");
		strings.add("B");
		strings.add("C");
		
		//Thread1
		Iterator<String> itr=strings.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		//Thread2
		strings.remove("C");
		
		//Thread1
		System.out.println(itr.next());
	}

}
