package collection;

import java.util.ArrayList;

public class GenericDemo2 {

	public static void main(String[] args) {
		ArrayList<?> a = new ArrayList();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("aaaa");
		list1.add("aaa");
		//list1.add(new Integer(100));
		System.out.println(list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		System.out.println(list2);
	}
}
