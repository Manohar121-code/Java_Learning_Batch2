package oops.constructorChaining;

public class SubClass extends SuperClass {
	
	public SubClass() {
		super();
		System.out.println("Subclass constructor called");
	}

	public void m2() {
		System.out.println("Subclass m2() called");
	}
	
}
