package oops.singletonClass;

public class Sample {
	
	static Sample obj;

	private Sample() {
		
	}
	
	public static Sample getObject() {
		if (obj == null) {
			obj = new Sample();
		}
		return obj;
	}
}
