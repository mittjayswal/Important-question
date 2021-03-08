package practice_program;

public class PrimeNumber {

	public static boolean findPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("17 Number is Prime = " + findPrime(17));
		System.out.println("2 Number is Prime = " + findPrime(2));
		System.out.println("6 Number is Prime = " + findPrime(6));
	}
}
