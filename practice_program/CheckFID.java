package practice_program;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*JAVA PROGRAMMING PROBLEM
-------------------------------------------------------
Solve the problems using the Java programming language. 
Choose your preferred way of testing these programs, either by using simple main method or by using JUnit test cases.  In either case, include the source code for the testing code you write.
________________________________________________________________________
Check if given string contains a valid Federal Identification (FID) number.  
If it is not valid, return "invalid". 
If it is valid, convert the string to one of two formats, depending on the value of the input  parameter EntityType :
 
i)                    If the EntityType value is �P� (Personal), convert the string to "XXX-XX-XXXX" format.  
ii)                   If the EntityType value is �B� (Business), convert the string to "XX-XXXXXXX" format.  
 
You can assume the EntityType is set correctly by the user to either �P� or �B.�
 
Valid input formats when EntityType = �P� are:
123-44-9876   (�dashes� in the correct position)
123 44 9876	(spaces in the correct position)
123449876    (No spaces)

You solution must also verify that only valid numbers/characters are entered.
 
If the user inputs any other format than the above 3, the program should return �Invalid entry.�  
For example, �123-44 9876�  is invalid because it uses one �-� and one space.
 
Valid input formats when EntityType = �B� are:
98-1234567	(dash in the correct position for a business FID)
981234567  	(no dashes)
98 1234567 	(space in the correct position for a business FID)


ALSO VALID ARE ANY VALID Personal FID�s, for example:
981-23-4567	(this is because sometimes people enter the same format at personal without knowing the FID is broken up differently.)
 
Examples
222-44-9876  and EntityType=�P�                                         	222-44-9876
123-44-5678  and EntityType=�B�                                         	12-34456789
ABC-44-5678  and EntityType=�B�                         	Invalid Entry
 */
public class CheckFID {

	public static final int FIDSIZE = 11;
	public static void main(String[] args) {
		Scanner FID = new Scanner(System.in);
		String s = null;
		char d = 0;
		
		boolean valid = false;

		System.out.println("Enter a Social Security Number");

		while (valid == false) {
			try {
				s = FID.nextLine();
				valid = true;
			} catch (Exception e) {
				System.out.println("No input! Enter a Social Security Number");
			}
		}
		System.out.println("Enter the Entity Type");

		try {
			d= (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (isFIDValid(s,d)) {
			System.out.println("My fid is valid = "+isFIDValid(s,d));
			System.out.println(convertString(s, d));
		}else {
			System.out.println("Please enter the valid FID");
		}
		

		
	}

	
	public static boolean isFIDValid(String fid, char c) {
		boolean isValid = false;
		boolean b= false;
		if (c == 'p' || c == 'P') {
			
			String expression2 = "^\\d{3}[-]?\\d{2}[-]?\\d{4}$";
			String expression1 = "^\\d{3}[ ]?\\d{2}[ ]?\\d{4}$";
			String expression3 = "^\\d{9}$";
			CharSequence inputStr = fid;
			Pattern p1 = Pattern.compile(expression1);
			Matcher m1 = p1.matcher(inputStr);
			Pattern p2 = Pattern.compile(expression2);
			Matcher m2 = p2.matcher(inputStr);
			Pattern p3 = Pattern.compile(expression3);
			Matcher m3 = p3.matcher(inputStr);
			
			if (m1.matches()|| m2.matches()||m3.matches()) {
				isValid = true;
			}
			

		} else if (c == 'b' || c == 'B') {
			
			String expression1 = "^\\d{2}[-]?\\d{6}$";
			String expression2 = "^\\d{2}[ ]?\\d{6}$";
			String expression3 = "^\\d{9}$";
			CharSequence inputStr = fid;
			Pattern pattern1 = Pattern.compile(expression1);
			Matcher matcher1 = pattern1.matcher(inputStr);
			
			Pattern pattern2 = Pattern.compile(expression2);
			Matcher matcher2 = pattern2.matcher(inputStr);
			
			Pattern pattern3 = Pattern.compile(expression3);
			Matcher matcher3 = pattern3.matcher(inputStr);
			if (matcher1.matches() || matcher2.matches() || matcher3.matches()) {
				isValid = true;
			}
		}
		return isValid;
	}

	

	public static String convertString(String fid, char c) {
		String s = fid.replaceAll("[- ]+", "");
		String newString = null;

		if (c == 'p' || c == 'P') {

			newString = s.substring(0, 3) + "-" + s.substring(3, 5) + "-" + s.substring(5);
			
		} else if (c == 'b' || c == 'B') {
			newString = s.substring(0, 2) + "-" + s.substring(2);
		}
		return newString;

	}

}
