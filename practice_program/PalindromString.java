package practice_program;

public class PalindromString {

	public static void main(String[] args) {
		String s = "mitttim";
		boolean ans = findUsingNormal(s);
		boolean ans1 = findPalindrome(s);
		
		System.out.println("String "+s+" is plaindrom = "+ans);
		System.out.println("String using reverse palindrom is = "+ans1);
	}

	private static boolean findPalindrome(String s) {
		String reverse = "";
		
		for (int i=s.length()-1; i>=0; i--) {
			reverse += s.charAt(i);
		}
		if (s.equals(reverse))
			return true;
		else 
			return false;
	}
	private static boolean findUsingNormal(String str) {
		int begin=0,i;
		int end= str.length()-1;
		int middle = (begin+end)/2;
		
		for (i=begin; i<=middle; i++) {
			if (str.charAt(begin) == str.charAt(end)) {
				begin ++;
				end --;
			}
			else
				break;
		}
		
		if (i == middle +1) {
			return true;
		}else
			return false;
	}
}
