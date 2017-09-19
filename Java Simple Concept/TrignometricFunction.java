package JavaSimpleConcept;

public class TrignometricFunction {

	public static void main(String[] args) {
		double sangle = 90;
		double angle = Math.toRadians(sangle); 
		System.out.println("sin("+angle+") = "+Math.sin(angle));
		System.out.println("cos("+angle+") = "+Math.cos(angle));
		System.out.println("tan("+angle+") = "+Math.tan(angle));
		
		System.out.println("\nsec("+angle+") = "+(1/Math.sin(angle)));
		System.out.println("cosec("+angle+") = "+(1/Math.cos(angle)));
		System.out.println("cot("+angle+") = "+(1/Math.tan(angle)));
		
	}
}
