package practice_program;

public class DecimalToBinary {

	public void converToBinary(int number) {
		int [] binary= new int [25];
		int index = 0;
		while (number > 0) {
			binary[index++] = number %2;
			number = number /2;
		}
		for (int i=binary.length-1; i>= 0; i--) {
			System.out.print(binary[i]);
		}
		
	}
	public static void main(String[] args) {
		DecimalToBinary b = new DecimalToBinary();
		b.converToBinary(8);
	}

	
}
