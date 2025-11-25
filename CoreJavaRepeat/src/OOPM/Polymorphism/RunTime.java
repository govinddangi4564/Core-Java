package OOPM.Polymorphism;

class Animal {
  void sound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("Dog barks");
  }
}

class Cat extends Animal {
  void sound() {
    System.out.println("Cat meows");
  }
}

public class RunTime {
  public static void main(String[] args) {
    Animal a1 = new Dog();  // upcasting
    Animal a2 = new Cat();  // upcasting

    a1.sound();  // Output: Dog barks
    a2.sound();  // Output: Cat meows
  }
}
