package oops.constructor;

public class Sample {
	
	int id;
	String name;
	
	public Sample() {
		System.out.println("Sample constructor called");
	}
	
	public Sample(int id, String name) {
		this.id  = id;
		this.name = name;
	}

}
