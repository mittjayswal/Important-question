package practice_program;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationsEx {

	 public static void main(String a[]) {
		 
	        List<String> output = StringPermutationsEx.generatePermutations("xyz");
	        System.out.println("Result size: "+output.size());
	        output.stream().forEach(System.out::println);
	        System.out.println("------------------");
	 
	    }
	 
	    public static List<String> generatePermutations(String input) {
	 
	        List<String> strList = new ArrayList<String>();
	        StringPermutationsEx.permutations("", input, strList);
	 
	        return strList;
	    }
	 
	    private static void permutations(String consChars, String input, List<String> opContainer) {
	 
	        if(input.isEmpty()) {
	        	//System.out.println("consChars+input"+consChars+"+"+input);
	            opContainer.add(consChars);
	            return;
	        }
	 
	        for(int i=0; i<input.length(); i++) {
	        	/*System.out.println("consChars+input.charAt(i)"+consChars+"---"+input.charAt(i));
	        	System.out.println("substring and second substring = "+ input.substring(0, i)+"---"+input.substring(i+1));
	        	System.out.println("opcontainer"+opContainer);
	        	System.out.println("---------------------------------------"+i);*/
	            permutations(consChars+input.charAt(i),
	                            input.substring(0, i)+input.substring(i+1),
	                            opContainer);
	           // System.out.println("return");
	        }
	    }
}
