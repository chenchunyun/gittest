package ch02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Object > li = new ArrayList<>();
		li.add("1字符串对象");//index = 0
		li.add("2字符串对象");//index = 1
		li.add("2字符串对象");//index = 2
		li.add(2, new Test());//在指定的索引位置插入一个元素对象
		System.out.println(li.indexOf("2字符串对象"));//从前向后查找对象出现的第一个位置
		System.out.println(li.lastIndexOf("2字符串对象"));//从后向前查找对象出现的第一个位置
		System.out.println(li.remove(2));//移除索引位置的对象
		li.set(2, "3字符串对象");//替换索引位置的对象（索引的位置，新对象）
		System.out.println(li);
		
	}

}
