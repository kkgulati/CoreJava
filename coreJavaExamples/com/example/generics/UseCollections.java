package com.example.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UseCollections {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("A", new Integer(400));
		map.put("B", new Integer(700));
		
		Set<String> set=map.keySet();
		System.out.println(set);
				
		System.out.println(map);
		
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
	}

}
