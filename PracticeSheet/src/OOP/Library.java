package OOP;

import java.util.ArrayList;

public class Library {
	ArrayList<String> books;
	
	public Library() {
		books = new ArrayList<String>();
	}
	
	public void addBooks(String book) {
		books.add(book);
	}
	
	public void removeBooks(String book) {
		books.remove(book);
	}
	
	public void display() {
		System.out.println("Books : " + books);
	}
	
	public static void main(String[] args) {
		Library lib  = new Library();
		
		lib.addBooks("Hindi");
		lib.addBooks("English");
		lib.addBooks("Physics");
		lib.addBooks("Chemistry");
		lib.addBooks("Maths");
		
		lib.display();
		
		lib.removeBooks("Maths");
		lib.display();
		
	}
}
