package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.LineListener;

public class ListDemo {
	public static void main(String args[]) {
		List<Object> li = new ArrayList<Object>();

		li.add("one");
		li.add("two");
		li.add(3);
		li.add(new Float(4.0F));
		li.add("two");
		li.add(new Integer(3));
		li.add(new Queue());

		System.out.println(li.size());
		li.remove(2);
		System.out.println(li.get(2));
		if(!(li.isEmpty())||li.contains("one")) {
			li.remove(li.get(li.indexOf("one")));
		}
		System.out.println(li);
		
	}

}
