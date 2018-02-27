package com.as.mitt.javainterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

	public void findDuplicateChars(String str) {
		char [] strChar = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (Character ch: strChar) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		Set<Character> ketSet = map.keySet();
		for (Character ch: ketSet) {
			if (map.get(ch)>1) {
				System.out.println(ch+" is repeated "+map.get(ch)+" times.");
			}
		}
	}
	public static void main(String[] args) {
		DuplicateCharsInString d = new DuplicateCharsInString();
		d.findDuplicateChars("mmitt");
	}
	
}
