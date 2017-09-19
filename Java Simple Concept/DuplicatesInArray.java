package JavaSimpleConcept;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		String [] array = {"abc","ab","abc","mitt"};
		
		System.out.println("1. Using Brute Force Method");
		
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				//System.out.println("i=="+array[i]+" j= "+array[j]);
				if((array[i] == (array[j]) && i!=j)){
					System.out.println("Duplicate element is = "+array[i]); 
					
				}
			}
		}
		
		System.out.println("\n2. Using Hashset");
		
		Set<String> set = new HashSet<>();
		for(String str:array){
			if(!set.add(str)){
				System.out.println("Duplicate element is: "+str);
			}
		}
	}
}
