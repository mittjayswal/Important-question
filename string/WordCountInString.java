package com.as.mitt.javainterview.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCountInString {

	public static void main(String[] args) {
		String s1 = "mitt krunal mitt yatin mitt sagar krunal";
		findduplicate(s1);
	}

	private static void findduplicate(String s1) {
		Map<String, Integer> map = new HashMap<>();
		
		
		String [] str = s1.split(" ");
		for (String s :str) {
			map.merge(s, 1, Integer::sum);
		}
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		for (Map.Entry<String, Integer> m:set) {
			if (m.getValue()>1) {
				System.out.println("Duplicate key= "+m.getKey()+" occurs "+m.getValue()+" times.");
			}
		}
		
		System.out.println("Java 8");
		map.entrySet().stream().filter(m->m.getValue()>1).forEach(System.out::println);
		map.forEach((k,v)->System.out.println(k+v));
	}
}
