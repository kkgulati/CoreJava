package com.example.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	
	public static void main(String[] args) {
		
		Collection<Integer> collection=Arrays.asList(120,100,45,34,78,90);
		NavigableSet<Integer> navigableSet=new TreeSet<Integer>(collection);

		Iterator<Integer> iterator=navigableSet.descendingIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.printf("Sub Set : %s%n",navigableSet.subSet(45,true, 90,true));
		
		System.out.printf("Floor Value : %d%n",navigableSet.floor(100));
		System.out.printf("Ceil Value : %d%n",navigableSet.ceiling(100));
		
		System.out.printf("Last Value : %d%n",navigableSet.last());
		System.out.printf("First Value : %d%n",navigableSet.first());
		
		System.out.printf("Reverse Set : %s%n",navigableSet.descendingSet());

		System.out.printf("Original Set : %s%n",navigableSet);
	}

}
