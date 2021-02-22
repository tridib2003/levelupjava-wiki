/*
 * Author: @tridib2003
 */

class Book {
	String name;
	String author;
	String publisher;
	int pages;
	
	// Constructor for Book
	Book(String name, String author, String publisher, int pages) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.pages = pages;
	}
	
	// Display book details
	void showDetails() {
		System.out.println("Name: " + name);
		System.out.println("Author: " + author);
		System.out.println("Publisher: " + publisher);
		System.out.println("Pages: " + pages);
	}
}

public class ParameterizedConstructors {

	public static void main(String[] args) {
		
		// Declare and assign values to book objects
		Book b1 = new Book("Introduction to Algorithms", "CLRS", "MIT Press", 1312);
		Book b2 = new Book("Algorithms", "Sedgewick", "Pearson Education", 992);
		
		// Display book 1 details
		b1.showDetails();
		
		System.out.println();
		
		// Display book 2 details
		b2.showDetails();
	}

}
