package Inheritence;

class user {
	String name;
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class student extends user {
	int StId;

	public int getStId() {
		return StId;
	}

	public void setStId(int stId) {
		StId = stId;
	}
}

class librarian extends user {
	int LibId;

	public int getLibId() {
		return LibId;
	}

	public void setLibId(int libId) {
		LibId = libId;
	}
}

class Book {
	int id;
	int price;
	String bookName;
	String AuthorName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

}

public class LibraryManagment {

	public static void main(String[] args) {
		user u = new user();

		u.setName("Shyam");
		u.setAge(60);

		System.out.println(".............User Details...............");
		System.out.println(u.name);
		System.out.println(u.age);

		student st = new student();

		st.setAge(18);
		st.setName("Ashok Chouhan");
		st.setStId(101);

		System.out.println("..........Student Details............");
		System.out.println(st.name);
		System.out.println(st.age);
		System.out.println(st.StId);

		librarian lb = new librarian();

		lb.setAge(30);
		lb.setLibId(1002);
		lb.setName("Arun");

		System.out.println("............Librarian Details..............");
		System.out.println(lb.name);
		System.out.println(lb.age);
		System.out.println(lb.LibId);

		Book b = new Book();

		b.setId(100);
		b.setPrice(500);
		b.setAuthorName("Chetan bhagat");
		b.setBookName("Atomic Habits");

		System.out.println(".............Book Details............");
		System.out.println("Book Name = " + b.bookName);
		System.out.println("Author Name = " + b.AuthorName);
		System.out.println("Id = " + b.id);
		System.out.println("Price = " + b.price);
	}
}
