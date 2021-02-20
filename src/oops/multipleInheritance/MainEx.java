package oops.multipleInheritance;

public class MainEx {
	public static void main(String[] args) {
		IParent1 obj = new ChildImpl();
		obj.m1();
		
		System.out.println("-----------");
		
		IParent2 obj2 = new ChildImpl();
		obj2.m1();
	}
}
