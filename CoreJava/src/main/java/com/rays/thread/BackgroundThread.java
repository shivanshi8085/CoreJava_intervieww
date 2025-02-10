package com.rays.thread;

public class BackgroundThread extends Thread {
	
	String name ;

	public BackgroundThread(String name) {
		this.name = name;
	}  

	@Override
	public void run() {

		while (true) {// Infinite loop, daemon thread background mein continuously chalega

			try {

				Thread.sleep(200);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(name);
		}
	}

}
