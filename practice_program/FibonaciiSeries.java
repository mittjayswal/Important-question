package practice_program;

public class FibonaciiSeries {

	public static void main(String[] args) {
		int number = 15;
		
		findSeries(number);
		
	}
	public static void findSeries (int number){
		int [] numberArray = new int[number];
		numberArray[0] = 0;
		numberArray[1] = 1;
		for (int i=2; i<number; i++) {
			numberArray[i] = numberArray[i-1] + numberArray[i-2];
		}
		System.out.print("Fibonacii series: ");
		for (int i:numberArray) {
			System.out.print(i+ " " );
		}
	}

	
}
