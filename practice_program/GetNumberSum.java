package practice_program;

/*Write a program to find sum of each digit in the given number using recursion.*/


public class GetNumberSum {
	
	public static void main(String[] args) {
		
		GetNumberSum n1 = new GetNumberSum();
		
		int sum = n1.findNumberSum(223);
		System.out.println(sum); 
		
	}

	int sum =0;
	
	private int findNumberSum(int number) {
		
		if (number ==0) {
			return number;
		}else {
			sum += number % 10;
			findNumberSum(number/10);
		}
		return sum;
		
		
	}
	
}
