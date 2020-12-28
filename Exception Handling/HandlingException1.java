/*
 * Author: @tridib2003
 */

public class HandlingException1 {

	public static void main(String[] args) {
		
		int a, b, res;
		
		try {
			
			a = 15;
			b = 0;
			res = a / b;
			System.out.println("Result = " + res);
		
		} catch (ArithmeticException exc){
			
			System.out.println("Can't perform division by 0");
		}
		
//		Statements after the try-catch mechanism
		System.out.println("Goodbye");
	}

}
