package part3.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<Integer> setObj = new HashSet<Integer>();
		setObj.add(10);
		setObj.add(15);
		setObj.add(30);
		setObj.add(30);
		setObj.add(10);
		setObj.add(100);
		
		System.out.println("size - "+ setObj.size());
		
		for (Integer i : setObj) {
			System.out.println(i);
		}
		System.out.println("----------");
		Iterator<Integer> itr = setObj.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}
		
		boolean empty = setObj.isEmpty();
		System.out.println("is empty? - "+ empty);
		
		boolean remove = setObj.remove(10);
		System.out.println("element removed? - "+ remove);
		
		System.out.println("----------");
		for (Integer i : setObj) {
			System.out.println(i);
		}
		
		Set<Integer> setObj2 = new HashSet<>();
		setObj2.add(100);
		setObj2.add(30);
		
		setObj.removeAll(setObj2);
		System.out.println("----------");
		for (Integer i : setObj) {
			System.out.println(i);
		}
		
	}
}
