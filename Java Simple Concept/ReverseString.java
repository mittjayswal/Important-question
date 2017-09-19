 package JavaSimpleConcept;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("1. Using StringBuffer: ");
		StringBuffer sb = new StringBuffer("mitt");
		System.out.println("Rev String = "+sb.reverse());
		
		System.out.println("\n2. Using iterative method: ");
		String s = new String("Mitt Jayswal");
		char [] ch = s.toCharArray();
		int left,right;
		right = ch.length-1;
		for (left =0;left<=right;left++,right--){
			//swap
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
		}
		System.out.println(ch);
		
		System.out.println("\n3. Using Recursive method: ");
		System.out.println(recursiveMethod(s));
		
	}
	static String recursiveMethod(String str){
		if((null == str) || (str.length()<=1)){
			return str;
		}
		System.out.println(str.substring(1) + "   "+str.charAt(0));
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
}
