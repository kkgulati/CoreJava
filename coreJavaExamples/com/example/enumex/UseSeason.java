package com.example.enumex;

public class UseSeason {
	public static void main(String[] args) {
		
		Season arr[]=Season.values();
		
		for(Season season :arr){
			System.out.println(season);
			System.out.println(season.ordinal());
			String months[]=season.getMonths();
			for(String m : months){
				System.out.println(m);
			}
		}
		
	}

}
