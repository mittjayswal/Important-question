package practice_program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountPairWithGivenSum {
	static int arr[] = new int[]{1,2,3,4,5,1} ;
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,};
		int sum = 5;
		givePairUsigIterativeWay(arr,sum);
		
		
		
        System.out.println("Count of pairs is " + 
                            getPairNumber(arr,sum));
	}

	private static void givePairUsigIterativeWay(int[] arr, int sum) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i]+arr[j] == sum)
					System.out.println("Pair is = "+arr[i]+ ", "+arr[j]);
			}
		}
	}

	private static int getPairNumber(int []arr, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		int second_count =0;
		
		for (int i=0; i<arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		map.forEach((k,v)-> System.out.println("k="+k+" v="+v));
		
		map.entrySet().stream().forEach(e->System.out.println("key ="+e.getKey()+" value="+e.getValue()));

		// second iteration
		for (int i=0; i<arr.length; i++) {
			if (map.get(sum-arr[i]) != null ) {
				second_count += map.get(sum-arr[i]);
			}
			
			if (sum-arr[i]== arr[i]) {
				second_count --;
			}
		}
		return second_count/2;
	}

	
	
	
}
