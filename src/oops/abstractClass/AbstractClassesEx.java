package oops.abstractClass;

public class AbstractClassesEx {
	public static void main(String[] args) {
		
		//Java won't allow to create object for abstract class
//		Parent p1 = new Parent();
		
		Child c1 = new Child();
		
		c1.test();
		c1.test2();
		
		System.out.println("-------------");
		
		Parent obj = new Child();//up cating
		obj.test();
		obj.test2();
		
	}
}
