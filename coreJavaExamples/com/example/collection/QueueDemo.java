package com.example.collection;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//Queue<String> queue=new PriorityQueue<String>(Arrays.asList("X","A","M","H"));
		Queue<String> queue=new ConcurrentLinkedQueue<String>(Arrays.asList("X","A","M","H"));
		
		System.out.println(queue);
		
		System.out.println();
		
		
	}
}
