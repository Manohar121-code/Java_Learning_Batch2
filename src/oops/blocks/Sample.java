package oops.blocks;

public class Sample {
	
	static int baseProperty;
	
	int instanceProperty;
	
	static {
		System.out.println("static block called");
		baseProperty = 20;
	}
	
	{
		instanceProperty = 30;
		System.out.println("non static block called");
	}
	
	public void test() {
		System.out.println("test() called");
	}
}
