package part3.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ListIterator<Integer> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Integer i = (Integer) listIterator.next();
			System.out.println(i);
		}
		System.out.println("---------");
		while (listIterator.hasPrevious()) {
			Integer i = (Integer) listIterator.previous();
			System.out.println(i);
		}
	}
}
