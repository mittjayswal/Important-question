package com.as.mitt.javainterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOccrenceInIntArray {

	public static void main(String[] args) {
		int [] array = {2,5,6,6,6,10,7};
		findoccurence(array);
	}

	private static void findoccurence(int[] array) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i: array) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		System.out.println("Input Array : "+Arrays.toString(array));
		System.out.println(map);
		
	}	
}
