package com.example.enumex;

import java.util.EnumSet;

public class EnumCollection {
	
	public static void main(String[] args) {
		
		EnumSet<Season> set=EnumSet.range(Season.SUMMER, Season.SPRING);
		
		System.out.println(set);
		
		for(Season s : set){
			System.out.println(s);
			System.out.println(s.getMonths());
		}
		
		
	}

}
