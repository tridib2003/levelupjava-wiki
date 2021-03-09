/*
 * Author: @tridib2003
 */

class Red {
	void displayColor() {
		System.out.println("Red");
	}
}

class Yellow extends Red {
	
	// Override displayColor() of superclass Red
	void displayColor() {
		System.out.println("Yellow");
	}
}

class Blue extends Yellow {
	
	// Override displayColor() of superclass Yellow
	void displayColor() {
		System.out.println("Blue");
	}
}

public class DyamicMethodDispatch {

	public static void main(String[] args) {
		
		Red redObj = new Red();
		Yellow yellowObj = new Yellow();
		Blue blueObj = new Blue();
		
		// Creating a reference of type Red
		Red ref;
		
		// ref referring to an object of type Red
		ref = redObj;
		// Executes displayColor() of class Red
		ref.displayColor();
		
		// ref referring to an object of type Yellow
		ref = yellowObj;
		// Executes displayColor() of class Yellow
		ref.displayColor();
		
		// ref referring to an object of type Blue
		ref = blueObj;
		// Executes displayColor() of class Blue
		ref.displayColor();

	}

}
