package part3.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java");
		
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "Sachin");
		map.put(18, "Kohli");
		map.put(7, "Dhoni");
		map.put(45, "Rohit");
		map.put(10, "Sachin2");
		map.put(17, "Kohli");
		
		System.out.println("size - "+ map.size());
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key - "+ key + " value - "+ value);
		}
		
		System.out.println("----------------------");
		
		String value = map.get(7);
		System.out.println("value - "+ value + " for key - "+ 7);
		
		System.out.println("---------------");
		
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			String val = map.get(key);
			System.out.println("key - "+ key + " value - "+ val);
		}
		
		System.out.println("--------------");
		Collection<String> values = map.values();
		for (String val : values) {
			System.out.println(val);
		}
		
		System.out.println("-----------");
		
		boolean containsKey = map.containsKey(100);
		System.out.println("contains 100 key - "+ containsKey);
		
		String remove = map.remove(17);
		System.out.println("removed element - "+ remove);
		
		System.out.println("---------------");
		
		Set<Integer> keySet2 = map.keySet();
		for (Integer key : keySet2) {
			String val = map.get(key);
			System.out.println("key - "+ key + " value - "+ val);
		}
		
	}
}
