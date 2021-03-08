package practice_program;

public class MySingleton {

	private static MySingleton obj;
	
	static {
		obj = new MySingleton();
	}
	
	private MySingleton() {
		
	}
	
	public static  MySingleton getInstance() {
		return obj;
	}
	
	public void test() {
		System.out.println("Yes Its working");
	}
	public static void main(String[] args) {
		MySingleton m = getInstance();
		m.test();
		
	}
}
