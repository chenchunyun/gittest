package collection;

import java.util.HashSet;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String args[]) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 1; i < 6; i++) {
			set.add(new Integer(i));
		}

		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
