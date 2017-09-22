package JavaSimpleConcept;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = "In the second method, we remove all white spaces (including tab also) "
				+ "          from a string without using replaceAll() method.";
		
		System.out.println("1. usng replaceAll() method:");
		String ans = s.replaceAll("\\s",	"");
		System.out.println(ans);
		
		System.out.println("\n2.Without replaceAll() method:");
		StringBuffer sb = new StringBuffer();
		char [] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++){
			if(charArray[i] != ' ' && charArray[i] != '\t'){
				sb.append(charArray[i]);
			}
		}
		System.out.println(sb);
		
		
	}
}
