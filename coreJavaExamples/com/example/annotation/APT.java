package com.example.annotation;

import java.lang.annotation.Annotation;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Method;

public class APT {
	
	public static void main(String[] args) {
		
		Class<HelloWorld> cls=HelloWorld.class;
		
		Annotation annotation[]=cls.getAnnotations();
		
		System.out.println(annotation.length);
		
		for(Annotation a : annotation){
			
			if(a instanceof Author){
				Author author=(Author)a;
				System.out.println("Name : "+author.name());
				System.out.println("Age : "+author.age());
				System.out.println("Address : "+author.address());
			}
		}
		
		
		Method method[]=cls.getDeclaredMethods();
		for(Method m : method){
			
			annotation=m.getAnnotations();
			System.out.println(m.getName());
			for(Annotation a : annotation){
				
				if(a instanceof Author){
					Author author=(Author)a;
					System.out.println("Name : "+author.name());
					System.out.println("Age : "+author.age());
					System.out.println("Address : "+author.address());
				}
			}
			
		}
		
		
	}

}
