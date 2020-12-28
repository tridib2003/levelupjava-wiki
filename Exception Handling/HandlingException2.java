/*
 * Author: @tridib2003
 */

import java.util.Random;

public class HandlingException2 {

	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0;
		
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			
			try {
				
				b = r.nextInt();
				c = r.nextInt();
				a = 12345 / (b/c);
				
			} catch (ArithmeticException e) {
				
//				Prints custom error message				
//				System.out.println("Division by 0 error");
				
//				Prints exception type and description
				System.out.println("Exception: " + e);
				
				a = 0;
			}
			
			System.out.println("a: " + a);
		}
	}
}
