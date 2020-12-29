/*
 * Author: @tridib2003
 */

public class FinallySample {
	
	//Throw an exception out of the method
	static void sampleA() {
		
		try {
			System.out.println("Inside sampleA()");
			throw new RuntimeException ("test exception");
		
		} finally {
			System.out.println("sampleA()'s finally");
		}
	}
	
	//Return from within a try block
	static void sampleB() {
		
		try {
			System.out.println("Inside sampleB()");
			return;
		
		} finally {
			System.out.println("sampleB()'s finally");
		}
	}
	
	//Normal execution of try block
static void sampleC() {
		
		try {
			System.out.println("Inside sampleC()");
			
		} finally {
			System.out.println("sampleC()'s finally");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			sampleA();
			
		} catch (Exception exc) {
			System.out.println("Exception: " + exc);
		}
		
		sampleB();
		sampleC();
	}
}
