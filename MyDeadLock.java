package com.as.mitt.javainterview;

public class MyDeadLock {

	String m1 = "Hello";
	String m2 = "World";
	
	Thread t1 = new Thread() {
		public void run() {
			while (true) {
				synchronized (m1) {
					synchronized (m2) {
						System.out.println(m1+m2);
					}
					
				}
			}
		}
	};
	
	Thread t2 = new Thread() {
		public void run() {
			while(true) {
				synchronized (m2) {
					synchronized (m1) {
						System.out.println(m1+m2);
					}
				}
			}
		}
		
	};
	public static void main(String[] args) {
		MyDeadLock m1 = new MyDeadLock();
		m1.t1.start();
		m1.t2.start();
	}
}
