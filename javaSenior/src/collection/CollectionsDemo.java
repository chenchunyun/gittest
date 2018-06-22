package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String args[]) {
		List li = new ArrayList();
		li.add("apple");
		li.add("pear");
		li.add("banana");
		li.add("grape");

		//获取集合中最大和最小的元素
	
		String max = (String) Collections.max(li);
		String min = (String) Collections.min(li);
		System.out.println("集合中的最大元素是" + max);
		System.out.println("集合中的最大元素是" + min);

		//对li进行排序
		Collections.sort(li);
		System.out.println(li);

	}

}
