package oops.blocks;

public class BlocksEx {
	public static void main(String[] args) {
		
		System.out.println("main() called!!!");
		
		Sample obj1 = new Sample();
		int i = Sample.baseProperty;
		System.out.println(i);
		
		Sample obj2 = new Sample();
		
		obj1.instanceProperty = 40;
		obj2.instanceProperty = 50;
		System.out.println(obj1.instanceProperty);
		System.out.println(obj2.instanceProperty);
		
		System.out.println("main() ended!!!");
	}
}
