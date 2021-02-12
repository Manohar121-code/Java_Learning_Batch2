package oops.methodOverriding;

public class Parent {
	public void method1() {
		System.out.println("Parent method1() called");
	}
	
	public void method2() {
		System.out.println("Parent method2() called");
	}
	
	public void method3() {
		System.out.println("Parent method3() called");
		method4();
	}
	
	private void method4() {
		System.out.println("Parent method3() called");
	}
}
