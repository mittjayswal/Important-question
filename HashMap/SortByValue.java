package com.as.collection.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortByValue {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("mitt", 10);
		map.put("akshay", 8);
		map.put("selvin", 20);
		map.put("akshar", 143);
		map.put("krihsna", 3);
		map.put("Chokop", 2);
		
		
		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		
		Collections.sort(list, (o1,o2)->-o2.getValue().compareTo(o1.getValue()));
		
		Map<String, Integer> finalMap = new LinkedHashMap<>();
		
		for (Map.Entry<String, Integer> entry:list) {
			finalMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("Sorted value");
		finalMap.forEach((k,v)->System.out.println("key="+k+" value ="+v));
	}
}
