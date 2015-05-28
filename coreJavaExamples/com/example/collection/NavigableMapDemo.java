package com.example.collection;

import java.util.NavigableMap;
import java.util.TreeMap;


public class NavigableMapDemo {
	
	public static void main(String[] args) {
	
			NavigableMap<String, Integer> navigableMap=new TreeMap<String, Integer>();
			navigableMap.put("A", 100);
			navigableMap.put("C", 200);
			navigableMap.put("X", 300);
			navigableMap.put("M", 400);
			navigableMap.put("F", 500);
			
			System.out.printf("Tail Map : %s%n",navigableMap.tailMap("F",true));
			System.out.printf("Head Map : %s%n",navigableMap.headMap("F",true));
			
			System.out.printf("Ceil Entry : %s%n",navigableMap.ceilingEntry("F"));
			
			System.out.printf("First Key : %s%n",navigableMap.firstKey());
			System.out.printf("First Entry : %s%n",navigableMap.firstEntry());
			
			System.out.printf("Reverse Map : %s%n",navigableMap.descendingMap());
			System.out.printf("Original Map : %s%n",navigableMap);
	}

}
