package com.as.mitt.javainterview;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<=3;i++) {
			list.add(i);
		}
		list.add(22);
		
		System.out.println("The duplicate number is:"+findDuplicate(list));
	}

	private static int findDuplicate(List<Integer> list) {
		int hightestnumber = list.size()-1;
		int total= findSum(list);
		int duplicate = total - (hightestnumber*(hightestnumber -1)/2);
		
		return duplicate;
		
	}
	private static int findSum(List<Integer> list) {
		int total =0;
		for(Integer a:list) {
			total += a;
		}
		return total;
	}
}
