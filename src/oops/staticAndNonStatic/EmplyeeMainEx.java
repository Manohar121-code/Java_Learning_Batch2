package oops.staticAndNonStatic;

public class EmplyeeMainEx {
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.id = 1;
		obj1.name = "Purna";
		
		Employee obj2 = new Employee();
		obj2.id = 2;
		obj2.name = "Jagadeesh";
		
		System.out.println(obj1.id);
		System.out.println(obj1.name);
		System.out.println(obj1.country);
		
		System.out.println("-------------");
		
		System.out.println(obj2.id);
		System.out.println(obj2.name);
		System.out.println(obj2.country);
		
	}
}
