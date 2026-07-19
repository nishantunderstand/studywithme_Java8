package java8_L2_lambdaExp;

public class LambdaSyntax {
	
	public static void main(String[] args) {
		
		Runnable runnable = () -> System.out.println("Lambda Program");
		
		new Thread(runnable).start();  
	}

}
