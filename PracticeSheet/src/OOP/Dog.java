package OOP;

public class Dog {
	private String name;
	private String breed;

	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public static void main(String[] args) {
		Dog d1 = new Dog("Tommy", "Labrador");
		Dog d2 = new Dog("Monny", "Golden Retriever");
		
		d1.setName("Tommy111");
		d2.setName("Monny111");
		
		System.out.println(d1.getName()+ "  " + d1.getBreed());
		System.out.println(d2.getName()+ "  " + d2.getBreed());
	}

}
