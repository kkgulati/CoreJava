package com.example.enumex;

public enum Season {
	WINTER("Dec","Jan","Feb"),SUMMER("Mar","Apr","May"),SPRING("Jun","Jul","Aug"),AUTUMN("Sep","Oct","Nov");
	
	String month[]=new String[3];
	
	private Season(String m1,String m2,String m3) {
		month[0]=m1;
		month[1]=m2;
		month[2]=m3;
	}
	
	public String[] getMonths(){
		return this.month;
	}
		
}
