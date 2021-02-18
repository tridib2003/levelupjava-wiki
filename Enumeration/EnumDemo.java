/*
 * Author: @tridib2003
 */

//An enumeration of exam grades
enum Grade {
	O, E, A, B, C, D, F;
}

public class EnumDemo {
	
	public static void main(String[] args) {
		
		// Declares `myGrade` as a variable of enumeration type `Grade`
		Grade myGrade;
		
		// `myGrade` can store only the values which are defined by the enumeration `Grade`
		myGrade = Grade.E;
		
		// Display the value stored in `myGrade`
		System.out.println("Grade: " + myGrade);
		
		System.out.print("Performance: ");
		
		switch(myGrade) {
		case O:
			System.out.println("Outstanding");
			break;
		case E:
			System.out.println("Excellent");
			break;
		case A:
			System.out.println("Good");
			break;
		case B:
			System.out.println("Average");
			break;
		case C:
			System.out.println("Poor");
			break;
		case D:
			System.out.println("Very Poor");
			break;
		case F:
			System.out.println("Fail");
			break;
		}
	}
}
