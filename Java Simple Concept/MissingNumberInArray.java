package JavaSimpleConcept;

public class MissingNumberInArray {

	
	public static int sumOfNumbers(int n){
		return (n*(n+1))/2;
	}
	public static int sumOfElements(int []a){
		int sum = 0;
		for(int i=0; i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = 8;
		int sumOfN = sumOfNumbers(n);
		
		int a [] = {1,2,3,5,6,7,8};
		int sumOfArray = sumOfElements(a);
		System.out.println("The missing Element is:"+(sumOfN-sumOfArray));
	}
}
