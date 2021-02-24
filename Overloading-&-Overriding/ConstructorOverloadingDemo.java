/*
 * Author: @tridib2003
 */

class Sum {
	
	private int num1, num2;
	
	// Sum() constructor - Version 1
	Sum() {
		num1 = 0;
		num2 = 0;
	}
	
	// Sum() constructor - Version 2
	Sum(int val) {
		num1 = num2 = val;
	}
	
	// Sum() constructor - Version 3
	Sum(int val1, int val2) {
		num1 = val1;
		num2 = val2;
	}
	
	// add() method
	void add() {
		int sum = num1 + num2;
		System.out.println("Sum is = " + sum);
	}
	
}
 
public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
			
		Sum ob1 = new Sum(); // Version 1 is called
		ob1.add(); // Output: Sum is = 0
		
		Sum ob2 = new Sum(3); // Version 2 is called
		ob2.add(); // Output: Sum is = 6
		
		Sum ob3 = new Sum(3, 4); // Version 3 is called
		ob3.add(); // Output: Sum is = 7
		
	}
}
