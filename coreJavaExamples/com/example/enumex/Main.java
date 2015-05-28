package com.example.enumex;

public class Main {
	
	public static void main(String[] args) {
		
		Month m1=Month.valueOf("JAN");
		System.out.println(m1);
		
		Month arr[]=Month.values();
		for(Month m : arr){
			System.out.println(m);
		}
				
		Person p1=new Person("Raj",Month.FEB);
		System.out.println(p1);
		
		Person p2=new Person("Rohan",Month.MAR);
		System.out.println(p2);

		//if(p1.getMonth()==p2.getMonth()){
		if(p1.getMonth().equals(p2.getMonth())){	
			System.out.println("Born in same month");
		}else{
			System.out.println("Not Born in same month");
		}
		
	}

}
