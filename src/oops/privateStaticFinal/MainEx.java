package oops.privateStaticFinal;

public class MainEx {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.test();
		
		Child c1 = new Child();
		c1.finalMethod();
		
		c1.staticMethod();
		
		System.out.println("-----------------");
		
		Parent.staticMethod();
		Child.staticMethod();
	}
}
