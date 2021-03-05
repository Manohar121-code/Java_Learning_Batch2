package part3.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sekhar", 76878);
		Employee e2 = new Employee(2, "Raju", 876876);
		Employee e3 = new Employee(3, "Mahesh", 65676);
		Employee e2Dup = new Employee(2, "Raju", 876876);
		
		Set<Employee> set = new LinkedHashSet<Employee>();
		set.add(e2);
		set.add(e1);
		set.add(e3);
		set.add(e2Dup);
		
		for (Employee e : set) {
			System.out.println(e);
		}
	}
}
