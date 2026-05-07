package OOP;

import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private String ISBN;

	static ArrayList<Book> booksCollection = new ArrayList<Book>();

	public Book(String title, String author, String iSBN) {
		this.title = title;
		this.author = author;
		ISBN = iSBN;
	}

	public static void addBook(Book book) {
		booksCollection.add(book);
		System.out.println("Book Added : " + book.title);
	}

	public static void removeBook(Book book) {
		booksCollection.remove(book);
		System.out.println("Book removed : " + book.title);
	}

	public static void display() {
		for (Book a : booksCollection) {
			System.out.println(a.title + "\t" + a.author + "\t" + a.ISBN);
		}
	}

	public static void main(String[] args) {
		Book b1 = new Book("Java", "Vidhyut sir", "101");
		Book b2 = new Book("Sql", "Shubham sir", "102");

		addBook(b1);
		addBook(b2);
		display();

		removeBook(b2);
		display();
	}
}