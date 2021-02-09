package oops.inheritance.multiLevel;

public class MultiLevelEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.move();
		System.out.println("-------------");
		
		PuppyDog puppyDog = new PuppyDog();
		puppyDog.move();
		puppyDog.bark();
		puppyDog.looks();
		
	}
}
