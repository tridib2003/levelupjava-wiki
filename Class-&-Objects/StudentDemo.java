/*
 * Author: @tridib2003
 */

class Student {
	String name;
	int rollno;
	double height;
}


public class StudentDemo {

	public static void main(String[] args) {
		
		// Creating an objects of type 'Student'
		Student s1; // Declares reference to an object
		s1 = new Student(); // Allocates memory to object
		Student s2 = new Student();
		
		// Assign values to variables of object 's1'
		s1.name = "Tanumoy";
		s1.rollno = 42;
		s1.height = 5.8;
		
		// Assign values to variables of object 's2'
		s2.name = "Tridib";
		s2.rollno = 44;
		s2.height = 5.7;
		
		// Display variable values of object 's1'
		System.out.println("~ Student 1 details ~");
		System.out.println("Name: " + s1.name);
		System.out.println("Roll No.: " + s1.rollno);
		System.out.println("Height: " + s1.height);
		
		System.out.println();
		
		// Display variable values of object 's2'
		System.out.println("~ Student 2 details ~");
		System.out.println("Name: " + s2.name);
		System.out.println("Roll No.: " + s2.rollno);
		System.out.println("Height: " + s2.height);
		
	}

}
