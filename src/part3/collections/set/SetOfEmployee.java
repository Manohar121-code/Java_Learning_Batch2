package part3.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetOfEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sekhar", 76878);
		Employee e2 = new Employee(2, "Raju", 876876);
		Employee e3 = new Employee(3, "Mahesh", 65676);
		Employee e4 = new Employee(1, "Sekhar", 46452);
		
		Set<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println("size - "+ set.size());
		
		System.out.println("-----------");
		
		for (Employee employee : set) {
			System.out.println(employee);
		}
	}
}
