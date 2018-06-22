package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionException {
	public static void main(String args[]) {
		List list = new ArrayList();
		list.add(new Integer(5));
		list.add("aaaaa");
		Iterator elements = list.iterator();
		while (elements.hasNext()) {
			Integer i = (Integer) elements.next();
		}

	}

}
