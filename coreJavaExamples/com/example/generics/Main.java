package com.example.generics;

public class Main {
	
	public static void main(String[] args) {
		
		
		DataHolder<String,Integer> dataHolder1=new DataHolder<String,Integer>("Pen",new Integer(10));
		System.out.println(dataHolder1.getData());
		System.out.println(dataHolder1.getCount());
		
		DataHolder<Integer,Long> dataHolder2=new DataHolder<Integer,Long>(new Integer(120),new Long(120000));
 		System.out.println(dataHolder2.getData());
 		System.out.println(dataHolder2.getCount());
 		
 		DataHolder<Product,Short> dataHolder3=new DataHolder<Product,Short>(new Product("Pencil"),new Short("12"));
 		System.out.println(dataHolder3.getData());
 		System.out.println(dataHolder3.getCount());
 		
	}

}
