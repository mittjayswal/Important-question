package reverseString;

public class UsingTocharAray {

	public static void main(String[] args) {
		String str = "Max Jayswal";
		
		char [] mychar = str.toCharArray();
		
		int left,right;
		
		right = mychar.length-1;
		
		for(left = 0;left<right; left++, right--){
			//swap
			char temp = mychar[left];
			mychar[left] = mychar[right];
			mychar[right] = temp;
		}
		for(char c : mychar){
			System.out.print(c);
		}
				
	}
}
