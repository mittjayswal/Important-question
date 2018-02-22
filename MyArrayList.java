package com.as.mitt.javainterview;

import java.util.Arrays;

public class MyArrayList {
	private Object myarray[];
	private int actSize;
	
	public MyArrayList() {
		this.myarray = new Object [10];
		this.actSize = 0;
	}
	public void add(Object obj) {
		if ((myarray.length -actSize)<=5) {
			increaseSize();
		}
		myarray[actSize++] = obj;
	}
	public void removeElement(Object obj) {
		int index=0;
		for (int i=0; i<myarray.length; i++) {
			if (myarray[i].equals(obj)) {
				index = i;
				myarray[index] = null;
				System.out.println("index to remove element: "+index);
			}
		}
		while(index < actSize) {
			myarray[index] = myarray[index+1];
			myarray[index+1] = null;
			index ++;
		}
		actSize--;
		
	}
	public int size() {
		return actSize;
	}
	private void increaseSize() {
		myarray = Arrays.copyOf(myarray, myarray.length*2);
		System.out.println("The new lenght = "+myarray.length);
		
	}
	public void printArray() {
		for (Object obj1:myarray) {
			System.out.println(obj1);
		}
	}
	public static void main(String[] args) {
		MyArrayList my = new MyArrayList();
		my.add(new Integer(10));
		my.add(new Integer(20));
		my.add(new Integer(30));
		my.add(new Integer(40));
		my.printArray();
		my.removeElement(20);
		System.out.println("ok");
		my.printArray();
		
	}
}
