/*
 * Author: @tridib2003
 */

class Sum {
	double num1;
	double num2;
	
	// This method assigns values to 'num1' and 'num2'
	void setValue(double a, double b) {
		num1 = a;
		num2 = b;
	}
	
	// This method computes and returns the sum
	double add() {
		return num1 + num2;
	}
}


public class SumDemo {

	public static void main(String[] args) {
		
		// Creating an object of class 'Sum'
		Sum s1 = new Sum();
		
		// Assigning values to the variables of object 's1'
		s1.setValue(5.7, 7.5);
		
		// Get the sum computed by add()
		double result = s1.add();
		
		// Display the sum
		System.out.println("Sum: " + result);
	}
}
