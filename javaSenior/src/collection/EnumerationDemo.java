package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(33);
		list.add(34);
		Enumeration<Integer> e = Collections.enumeration(list);
		while(e.hasMoreElements()){
			 System.out.println((Integer)(e.nextElement()));
		}

	}

}
