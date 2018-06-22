package ch02;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Object> links = new LinkedList<Object>();
		links.add("中国");
		links.add("海南");
		links.addFirst("北京");
		links.addLast("台湾");
		System.out.println(links);
		
	}
}
