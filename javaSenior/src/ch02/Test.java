package ch02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		System.out.println("输入若干个单词，以空格分开。");
		String s = in.nextLine();
		String[] a = s.split(" ");
//		for (int i = 1; i < a.length; i++) {
//			for (int j = 0; j < a.length-i; j++) {
//				if (a[j].compareToIgnoreCase(a[j+1]) > 0) {
//					s = a[j];
//					a[j] = a[j+1];
//					a[j+1] = s;
//				}
//			}
//		}
		for (String o : a) {
			list.add(o);
		}
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.compareToIgnoreCase(o2);
			}
		});
		for (String o :list) {
			System.out.println(o);
		}
		in.close();
	}

}
