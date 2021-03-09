/*
 * Author: @tridib2003
 */

abstract class Dog {
	
	void scientificName() {
		System.out.println("Canis lupus familiaris");
	}
	
	// Declare abstract method
	abstract void breed();
}

class Poodle extends Dog {
	
	// Implement abstract method breed()
	void breed() {
		System.out.println("This a Poodle");
	}
}

class Pomeranian extends Dog {
	
	// Implement abstract method breed()
	void breed() {
		System.out.println("This a Pomeranian");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		// Dog dogObj = new Dog(); // An abstract class cannot be instantiated
		
		Poodle poodleObj = new Poodle();
		poodleObj.scientificName();
		poodleObj.breed();
		
		Pomeranian pomeranianObj = new Pomeranian();
		pomeranianObj.breed();
	}

}
