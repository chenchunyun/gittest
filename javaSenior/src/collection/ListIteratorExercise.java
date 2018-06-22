package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExercise {
	public static void main(String args[]) {

		List ll = new ArrayList();
		// 为数组赋值
		for (int i = 0; i < 6; i++) {
			ll.add(new Integer(i));
		}
		// 遍历输出没一个元素
		ListIterator lit = ll.listIterator();
		while (lit.hasNext()) {
			System.out.print(lit.next() + " ");
		}

		System.out.println();
		ListIterator lit3s = ll.listIterator();
		// 逆序输出每个元素的值
		while (lit.hasPrevious()) {
			System.out.print(lit.previous() + " ");
		}

	}

}
