package reverseString;

public class UsingStringBuilder {
	/*Using built in reverse() method of the StringBuilder 
	class: String class does not have reverse() method.*/
	
	public static void main(String[] args) {
		String str = "Max Jayswal";
		
		StringBuilder myBuilder = new StringBuilder();
		
		myBuilder.append(str);
		
		myBuilder = myBuilder.reverse();
		
		for(int i=0;i<myBuilder.length();i++){
			System.out.print(myBuilder.charAt(i));
		}
	}
	
}
