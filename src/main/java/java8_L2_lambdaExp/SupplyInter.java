package java8_L2_lambdaExp;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplyInter {

	public static void main(String[] args) {
		
		Supplier<String> supp = () -> LocalDate.now().toString();
		
		System.out.println("Today's date is " + supp.get().toString());
		
		
	}

}
