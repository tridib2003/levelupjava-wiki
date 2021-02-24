/*
 * Author: @tridib2003
 */

class Sum {
	
	// add() - version 1
	// Method add() having two integer parameters
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// add() - version 2
	// Overload method add(), having two double parameters
	double add(double num1, double num2) {
		return num1 + num2;
	}
	
	// add() - version 3
	// Overload method add(), having one integer and one double parameters
	double add(int num1, double num2) {
		return num1 + num2;
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		Sum ob = new Sum();
		
		int sum1 = ob.add(14, 3); // add() - version 1 is invoked
		System.out.println("Sum 1: " + sum1);
		
		double sum2 = ob.add(13.2, 4.5); // add() - version 2 is invoked
		System.out.println("Sum 2: " + sum2);
		
		double sum3 = ob.add(6, 11.7); // add() - version 3 is invoked
		System.out.println("Sum 3: " + sum3);
		
	}

}
