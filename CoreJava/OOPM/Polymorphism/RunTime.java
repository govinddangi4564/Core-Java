package Polymorphism;

	class Animal{
		
		public void eat() {
			System.out.println("Animal eat Meat...");
		}
		
		public void leg() {
			System.out.println("Animal has 4 leg...");
		}
		
		public void sleep() {
			 System.out.println("Animal is sleeping....");
		}
	}
	
	class Dog extends Animal {
		
		public void eat() {         // Method Override
			System.out.println("Dog Eat Padigarii...");
		}
	}
	
	class Deer extends Animal{
		
		public void eat() {         // Method Override
			System.out.println("Deer Eat Grass....");
		}
	}
	
	public class RunTime{
		public static void main(String[] args) {
				
				Animal an = new Animal();
				
				an.eat();
				an.leg();
				an.sleep();
				
				Dog dg = new Dog();
				
				dg.eat();
				dg.leg();
				dg.sleep();
	
				Deer dr = new Deer();
				
				dr.eat();
				dr.leg();
				dr.leg();
		}
	}