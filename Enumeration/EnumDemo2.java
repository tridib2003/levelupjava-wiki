/*
 * Author: @tridib2003
 */

//An enumeration of planets in the solar system
enum Planet{
	MERCURY, VENUS, EARTH, MARS,
	JUPITER, SATURN, URANUS, NEPTUNE
}

public class EnumDemo2 {
	
	public static void main(String[] args) {
		
		// Assign all values of enum 'Planet' to an array of same enum type
		Planet allPlanets[] = Planet.values();
		
		// Displays all values contained in 'Planet'
		System.out.println("Planets in the Solar System: ");
		
		for (Planet p : allPlanets) {
			System.out.println(p);
		}
		
		// Declares `star` as a variable of enumeration type `Planet`
		Planet star;
		
		// Check if `Planet` has a specific element 
		String check = "PLUTO";
		
		try {
		
		star = Planet.valueOf(check);
		
		System.out.println("Planet " + star + " found");
		
		} catch(IllegalArgumentException iae) {
			
			System.out.println("Planet " + check + " not found");
		}
		
	}
}
