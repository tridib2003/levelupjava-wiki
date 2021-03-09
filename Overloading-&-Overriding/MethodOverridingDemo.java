/*
 * Author: @tridib2003
 */

class Animal {
	
	String msg1 = "All animals are not dogs";
	
	void displayMessage() {
		System.out.println(msg1);
	}
}

class Dog extends Animal {
	
	String msg2 = "All dogs are animals";
	
	// This method overrides the method in superclass Animal
	void displayMessage() {
		System.out.println(msg1);
		System.out.println(msg2);
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		Dog obj = new Dog();
		
		// Executes displayMessage() of class subclass Dog
		obj.displayMessage();
		
	}

}
