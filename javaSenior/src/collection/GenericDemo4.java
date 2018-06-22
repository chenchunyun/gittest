package collection;

import java.util.ArrayList;

public class GenericDemo4 {
	public static void printList(ArrayList<?> list) {
		for (Object element : list) {
			System.out.println(element);
		}
/**
 * 上面三行为Java 5.0新特性(增强for循环)，它可以遍历集合中的元素，这里需要注意的地方是:
 * element的类型必须是Object的，原因是：这里使用了通配符"?"，它可以代表任意类型的数据，
 * 所以必须拿Object类型的变量来接收
 */
	}

}
