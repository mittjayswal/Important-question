package JavaSimpleConcept;

import java.util.Scanner;

public class NumberOrNot {

	static boolean checkNumberOrNot(String s){
		
		try{
			Integer.parseInt(s);
		}catch(NumberFormatException n){
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Check mobile number or not");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check mobile number:");
		String m = sc.nextLine();
		if(checkNumberOrNot(m) && m.length()== 10 ){
			System.out.println("You have entered the valid mobile number  ");
		}else {
			System.out.println("you have entered the wrong mobile number");
		}
		
	}
	
	
}
