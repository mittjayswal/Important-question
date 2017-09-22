package JavaSimpleConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		
		String [] str1 = {"Mitt","Krishna", "mitt", "Yatin"};
		String [] str2 = {"Mitt","Krishna","mitt","narena"};
		
		System.out.println("1. Using iterative method: ");
		for(int i=0; i<str1.length;i++){
			for(int j=0;j<str2.length; j++){
				if(str1[i].equals(str2[j])){
					System.out.print(" "+str1[i]);
				}
			}
		}
		
		System.out.println("\n\n"
				+ "2. Using retainsAll() method: ");
		Integer [] a1 = {1,2,3,4};
		Integer [] a2 = {1,2,7,8,9};
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(a1));	
		Set<Integer> set2 = new HashSet<>(Arrays.asList(a2));
		
		set1.retainAll(set2);
		System.out.println(set1);
		
	}
}
