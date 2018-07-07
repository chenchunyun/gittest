package ch02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String str1 = new String("666");
		list.add("ab");
		list.add("ac");
		list.add("aa");
		list.add("ad");
		list.add(str1);
		System.out.println(list);
		Collections.sort(list);;//对参数中的集合排序
		System.out.println(list);
		//Collections.reverse(list);//对参数中的集合反转
		System.out.println(list);
		//查找集合中最大的和最小的对象
		System.out.println(Collections.max(list)+"\t"+Collections.min(list));
		//使用二分位查找list集合中"aa"元素的位置,使用这个方法前要先对集合进行升序排序
		System.out.println(Collections.binarySearch(list, "aa"));
		//Collections.fill(list, "666");
		System.out.println(list);
		ArrayList<String> dest = new ArrayList<String>();
		dest.add("");
		dest.add("");
		dest.add("");
		dest.add("");
		dest.add("");
		dest.add("");
		Collections.copy(dest, list);
		System.out.println(dest);
		
		
	}
}
