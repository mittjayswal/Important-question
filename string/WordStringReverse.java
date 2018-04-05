package com.as.mitt.javainterview.string;

import java.util.ArrayList;

public class WordStringReverse {

	public static void main(String[] args) {
		String s= "My Name is Mitt";
		ArrayList<String> list = new ArrayList<>();
		list = reverseString (s,list);
		list.trimToSize();
		StringBuffer buffer = new StringBuffer();
		for (int i=list.size()-1;i>=0;i--) {
			buffer.append(list.get(i)+ " ");
		}
		System.out.println("Final = "+buffer);
			
		
	}

	private static ArrayList<String> reverseString(String s, ArrayList<String> list) {
		
		int index = s.indexOf(" ");

		list.add(s.substring(0, index));
		
		String st = s.substring(index+1);
		
		if (st.indexOf(" ")==-1) {
			list.add(st.substring(0));
			return list;
		}
		return reverseString(st, list);
	}
}
