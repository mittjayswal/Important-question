package com.as.mitt.javainterview.string;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s= "Hello Mr Mitt";
		s.replaceAll("\\s", "");
		StringBuffer buffer = new StringBuffer();
		for(int i =0;i<s.length();i++) {
			if (s.charAt(i)!=' ')
				buffer.append(s.charAt(i));
		}
		System.out.println(buffer);
	}
}
