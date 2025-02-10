package com.rays.thread;

public class TestPriority {
	public static void main(String[] args) {
		
		PriorityThread t1 = new PriorityThread("shivanshi");

		PriorityThread t2 = new PriorityThread("lansi");

		t1.setPriority(10);
		t2.setPriority(2);

		t1.start();
		t2.start();


	}

}

//Java mein thread priority ka range 1 (low) se 10 (high) hota hai.//Default priority: 5.
//High-priority threads ko JVM execution ke liye zyada preference deti hai.
//Low-priority threads bhi execute hote hain, lekin scheduling delay ho sakta hai.


