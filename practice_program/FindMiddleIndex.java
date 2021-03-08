package practice_program;

public class FindMiddleIndex {

	private static int findMiddleindex(int[] array) {
		int endIndex = array.length-1;
		int startIndex = 0;
		int leftSum = 0;
		int rightSum = 0;
		while (true) {
			if (leftSum > rightSum) {
				rightSum += array[endIndex--];
			}
			else {
				leftSum+= array[startIndex++];
			}
			if (startIndex>endIndex) {
				if(leftSum == rightSum) {
					break;
				}
				else {
					System.out.println("please neter the correct array");
				}
			}
		}
		return endIndex;
	}
	

	public static void main(String[] args) {
		int array[] = {2, 4, 4, 5, 4, 1 };
		
		System.out.println("The sum till index: "+findMiddleindex(array)+" is equal to sum of rest");
	}
}
