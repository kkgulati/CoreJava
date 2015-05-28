package com.example.collection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapDemo {
	
	public static void main(String[] args) {
		
		ConcurrentMap<String, Integer> concurrentMap=new ConcurrentHashMap<String, Integer>();
		
		concurrentMap.put("A",100);
		concurrentMap.put("B",200);
		concurrentMap.put("C",300);
		
		System.out.println(concurrentMap);
		
	}

}
