package com.as.mitt.test;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
