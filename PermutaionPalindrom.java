package com.as.mitt.javainterview;

import java.util.HashMap;
import java.util.Map;

public class PermutaionPalindrom implements Cloneable {
	
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		String s = "xyz";
		PermutaionPalindrom p = new PermutaionPalindrom();
		
		Map<String, Boolean> ans = p.findPermutation(s);
		System.out.println(ans);
		
	}

	private Map<String, Boolean> findPermutation(String s) {
		
		Map<String, Boolean> mapContainer = new HashMap<>();
				
		String consStr = "";
		permutaion(consStr,s,mapContainer);
		
		return mapContainer;
		
	}

	private void permutaion(String consStr, String s, Map<String, Boolean> mapContainer) {

		if (s.isEmpty()) {
			boolean ans = checkPalindrom(consStr);
			mapContainer.put(consStr, ans);
			return;
		}
		for (int i=0; i<s.length(); i++) {
			permutaion(consStr + s.charAt(i),
			s.substring(0, i)+ s.substring(i+1),
			mapContainer);
		}
			
	}

	private boolean checkPalindrom(String consStr) {
		int begin = 0, end = consStr.length()-1, middle =((begin+end)/2) , i;
		
		for (i=begin; i<=middle;i++) {
			if (consStr.charAt(begin) == consStr.charAt(end) ) {
				begin ++;
				end --;
				
			}else 
				break;
		}
		if (i== middle+1) {
			return true;
		}
		else
			return false;
		
	}
}
