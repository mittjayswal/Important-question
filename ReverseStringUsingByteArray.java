package reverseString;

public class ReverseStringUsingByteArray {

	public static void main(String[] args) {
		String str = "mitt";
		
		byte [] strByte = str.getBytes();
		
		byte [] ans = new byte [strByte.length];
		
		for(int i=0; i<strByte.length; i++){
			ans[i] = strByte[strByte.length-i-1];
		}
		System.out.println(new String(ans));
	}
}
