package part3.collections.set;

import java.util.Comparator;

public class SortByName implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		int compareTo = o1.getName().compareTo(o2.getName());
		return compareTo;
	}

}
