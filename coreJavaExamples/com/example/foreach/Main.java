package com.example.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Main {
	
	public static void main(String[] args) {
		
		
		int arr[]={23,56,78,990,76};
		Object o=arr;
		
		for(int v : arr){
			System.out.println(v);
		}
		
		Collection<String> collection=Arrays.asList("X","R","F","A");
		List<String> strings=new ArrayList<String>(collection);
		
		for(String string: strings){
			System.out.println(string);
		}
		
		
	}

}
