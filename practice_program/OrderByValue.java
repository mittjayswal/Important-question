package practice_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Sort or order a HashMap or TreeSet or any map item by value. Write a comparator
which compares by value, not by key. Entry class might helps you here.*/

public class OrderByValue {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Java", 1);
		map.put("Unix", 8);
		map.put("Spring", 2);
		map.put("c", 10);
		map.put("C#", 3);
		
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<>(set);
		
		Collections.sort(list, (o1,o2) -> o1.getValue().compareTo(o2.getValue()));
		
		for (Entry<String, Integer> entry:list) {
			System.out.println("key = "+ entry.getKey()+" value = "+entry.getValue());
		}
		
	}
	
	
}
