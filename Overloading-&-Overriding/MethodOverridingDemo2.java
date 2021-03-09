/*
 * Author: @tridib2003
 */

class Animal {
	
	String msg1;
	
	Animal(String m1) {
		msg1 = m1;
	}
	
	void displayMessage() {
		System.out.println(msg1);
	}
}

class Dog extends Animal {
	
	String msg2;
	
	Dog(String m1, String m2) {
		
		// Executes the immediate superclass constructor
		super(m1);
		
		msg2 = m2;
	}
	
	// This method overrides the method in superclass Animal
	void displayMessage() {
		
		// Access the displayMessage() of the superclass A
		super.displayMessage();
		
		System.out.println(msg2);
	}
}

public class MethodOverridingDemo2 {

	public static void main(String[] args) {
		
		String msg1 = "All animals are not dogs";
		String msg2 = "All dogs are animals";
		
		Dog obj = new Dog(msg1, msg2);
		
		// Executes displayMessage() of class subclass Dog
		obj.displayMessage();
		
	}

}
