package practice_program;


/*Write a program to find top two maximum numbers in the
given array. You should not use any sorting functions. You
should iterate the array only once. You should not use any
kind of collections in java.*/

public class TwoMaxNumbers {

	public static void main(String[] args) {
		int [] array = {2,5,6,10,7};
		findTwoMax(array);
	}

	private static void findTwoMax(int[] array) {
		int oneMax = 0;
		int twoMax= 0;
		for (int i:array) {
			if (i>oneMax) {
				twoMax = oneMax;
				oneMax = i;
			}
			else if (i>twoMax) {
				twoMax = i;
			}
		}
		System.out.println("First max number:"+oneMax);
		System.out.println("Second max number:"+twoMax);
		
		
	}
}
