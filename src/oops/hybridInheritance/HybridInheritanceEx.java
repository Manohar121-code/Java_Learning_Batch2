package oops.hybridInheritance;

public class HybridInheritanceEx {
	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.chil1();
		c1.parent();

		System.out.println("-----------");
		
		Child2 c2 = new Child2();
		c2.parent();
		c2.child2();
		
		System.out.println("-----------");
		
		Child3 child3 = new Child3();
		child3.parent();
		child3.child2();
		child3.child3();
		
	}
}
