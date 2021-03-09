/*
 * Author: @tridib2003
 */

class Red {
	void displayColor() {
		System.out.println("Red");
	}
}

class Yellow extends Red {
	
	// Overridden method
	void displayColor() {
		System.out.println("Yellow");
	}
}

class Blue extends Yellow {
	
	// Overridden method
	void displayColor() {
		System.out.println("Blue");
	}
}

public class DyamicMethodDispatch {

	public static void main(String[] args) {
		
		Red redObj = new Red();
		Yellow yellowObj = new Yellow();
		Blue blueObj = new Blue();
		
		// Creating a reference of super class Red
		Red ref;
		
		// ref referring to an object of class Red
		ref = redObj;
		// Executes displayColor() of class Red
		ref.displayColor();
		
		// ref referring to an object of class Yellow
		ref = yellowObj;
		// Executes displayColor() of class Yellow
		ref.displayColor();
		
		// ref referring to an object of class Blue
		ref = blueObj;
		// Executes displayColor() of class Blue
		ref.displayColor();

	}

}
