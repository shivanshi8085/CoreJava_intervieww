package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPollOffer {
	public static void main(String[] args) {

		Queue q1 = new PriorityQueue();
		q1.offer(3);
		q1.offer(4);
		System.out.println(q1.poll());
		System.out.println(q1.remove());
		//System.out.println(q1.remove());
		
		

	}

}
