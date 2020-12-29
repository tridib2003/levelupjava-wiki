/*
 * Author: @tridib2003
 */

public class ThrowSample {

	static void sample() {
		
		try {
			throw new NullPointerException ("throw sample");
		
		} catch(NullPointerException exc) {
			System.out.println("Caught inside sample()");
			throw exc; // exception is rethrown
		}
	}
	
	public static void main(String[] args) {
		
		try {
			sample();
			
		} catch(NullPointerException exc) {
			System.out.println("Inside main(): " + exc);
		}
	}
}
