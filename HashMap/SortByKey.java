package com.as.collection.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortByKey {

	public static void main(String[] args) {
		Map< String, String> map = new HashMap<>();
		
		map.put("mitt", "z");
		map.put("selvin", "dodhyo");
		map.put("akshay", "australia");
		map.put("akshar", "vadoadra");
		map.put("krishna", "dandiya bazar");
		
		Map<String, String> treemap = new TreeMap<>(map);
		
		System.out.println("Ascending order: "+"\n");
		treemap.forEach((k,v)->System.out.println("key="+k+"         value="+v));
		
		/*Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String, String> m:set) {
			System.out.println("key="+m.getKey()+" value="+m.getValue());
		}
		Set<String> set1 = map.keySet();
		for (String s:set1) {
			System.out.println("v="+map.get(s)+" key="+s);
		}*/
		
		System.out.println("Descending order");
		Map<String, String> map3 =  new TreeMap<>((o1,o2)->o2.compareTo(o1));
		map3.putAll(map);
		map3.forEach((k,v)->System.out.println("key ="+k+" value="+v));
		
		
		
		
		
		
	}
}
