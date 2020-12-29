/*
 * Author: @tridib2003
 */

public class ThrowsSample {
	
	static void sample() throws IllegalAccessException {
		System.out.println("Inside sample()");
		throw new IllegalAccessException("test exception");
	}
	
	public static void main(String args[]) {
		
		try {
			sample();
			
		} catch(IllegalAccessException exc) {
			System.out.println("Inside main(): " + exc);
		}
	}
}
