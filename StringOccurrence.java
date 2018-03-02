package com.as.mitt.javainterview;

public class StringOccurrence {

	
	public int findOccurenceOfString(String string, String input) {
		int count = 0;
		for(int i=0;i<=string.length()-input.length();i++) {
			if (string.substring(i,i+input.length()).equals(input)) {
				count++;
			}
		}
		return count;
				
	}
	
	
	public static void main(String[] args) {
		StringOccurrence st = new StringOccurrence();
		int count = st.findOccurenceOfString("abcdefabcc", "abc");
		System.out.println("The string abc appears "+ count +" in a string abcdefabcc");
	}
}
