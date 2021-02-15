package oops.typeCasting;

public class ClassCastingEx {
	public static void main(String[] args) {
		Parent obj = new Child(); // upcasting
		obj.test();
		obj.test2();
//		obj.test3();
		System.out.println("----------------");
		
//		Child obj2 = new Parent(); //wrong
		
		if (obj instanceof Child) {
			Child obj2 = (Child) obj; //down casting
			obj2.test();
			obj2.test2();
			obj2.test3();
		}
		
		System.out.println("Main ended");
	}
}
