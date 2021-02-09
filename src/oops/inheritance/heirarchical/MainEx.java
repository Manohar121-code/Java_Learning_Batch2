package oops.inheritance.heirarchical;

public class MainEx {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("Animal properties");
		animal.move();
		animal.eat();
		
		System.out.println("Dog properties");
		Dog dog = new Dog();
		dog.bark();
		dog.move();
		dog.eat();
		
		System.out.println("Man properties");
		Man man = new Man();
		man.move();
		man.eat();
		man.work();
	}
}
