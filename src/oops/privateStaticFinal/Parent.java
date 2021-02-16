package oops.privateStaticFinal;

public class Parent {
	public void test() {
		System.out.println("Parent test() called");
	}
	
	public void test2() {
		System.out.println("Parent test2() called");
	}
	
	private void privateMethod() {
		System.out.println("Parent privateMethod() called");
	}
	
	public final void finalMethod() {
		System.out.println("Parent finalMethod() called");
	}
	
	public static void staticMethod() {
		System.out.println("Parent staticMethod() called");
	}
}
