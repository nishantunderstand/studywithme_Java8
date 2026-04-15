package java8_L2_lambdaExp;

public class FunInterface {
	
	public static void main(String[] args) {
		
		Test test = n -> System.out.println("Hello "+ n);
		test.fun("Interface");
	}
}
