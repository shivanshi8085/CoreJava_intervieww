package com.rays.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestElementPeek {
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		q.offer(1);
		q.offer(2);
		
		//System.out.println(q.element());
		System.out.println(q.peek());
		q.clear();
		//System.out.println(q.element());
		System.out.println(q.peek());
	}

}
