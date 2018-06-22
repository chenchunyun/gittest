package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String args[]) {
		/*
		 * HashSet
		 * 元素是无序的，不允许重复的
		 * 按照HashCode()来存储
		 */
		HashSet s = new HashSet<String>();
		s.add("one");
		s.add("two");
		s.add(3);//JDK1.5后的新特性，不用创建包装类就可以直接传值
		s.add(new Float(4.0F));
		s.add("two");
		System.out.println(s);

		/*
		 * TreeSet
		 * 元素是无序的，不允许重复
		 * 按照排序树来存储,且要求各元素间的类型是可比较的
		 */
		TreeSet tree = new TreeSet();
		tree.add("one");
		tree.add("pwo");
		tree.add(new Integer(3).toString());
		tree.add(new Float(4.0F).toString());
		tree.add("pwo");
		tree.add(new Integer(3).toString());
		System.out.print(tree);

	}

}
