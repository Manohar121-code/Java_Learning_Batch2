package oops.methodOverriding;

public class Child extends Parent {

	public void method1() {
		super.method2();
		System.out.println("Child method1() called");
	}
	
}
