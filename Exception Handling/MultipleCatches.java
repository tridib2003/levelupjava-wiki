/*
 * Author: @tridib2003
 */

import java.util.Random;

public class MultipleCatches {

	public static void main(String[] args) {

		int num1, num2, res;
		int[] arr = new int[10];
		
		Random r = new Random();
		
		for (int i = 0; i <= 10; i++) {
		
			try {
			
				num1 = r.nextInt();
				num2 = r.nextInt();
				res = num1 / num2;
				
				arr[i] = res;
				
				System.out.println("Number " + res + " inserted at index " + i);
				
			} catch (ArithmeticException exc) {
				System.out.println("Exception: " + exc);
			} catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("Exception: " + exc);
			}
		}
	}
}
