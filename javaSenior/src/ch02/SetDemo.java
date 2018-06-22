package ch02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		/***
		 * HashSet 不允许存放重复的对象，存入顺序与存储的顺序是不一样的，无序
		 *         按照hashCode来存储
		 */
		Set<Object> hs = new HashSet<Object>();
		hs.add("ab");
		hs.add("ac");
		hs.add("bx");
		hs.add("bc");
		Set<Object> hsz = new HashSet<Object>();
		hsz.add("中国");
		hsz.add("北京");
		hsz.add("武汉");
		System.out.println(hs.contains("ab"));//true包含某个对象吗？返回true或false
		System.out.println(hs.size());//集合的尺寸长度
		//hs.remove("ab");//删除集合中的某个对象
		//hs.clear();//清楚所有集合对象元素
		System.out.println(hs.isEmpty());//判断集合是否为空
		hs.addAll(hsz);//在集合中添加另一个集合
		//hs.removeAll(hsz);//在集合中删除一个子集合
		hs.retainAll(hsz);//让hs集合只保留hsz集合 ，移除其他所有的内容
		System.out.println(hs);
		
		
		
		/***
		 * TreeSet 不允许存放重复的对象，存入的顺序和存储的顺序不一样的，无序
		 *         存储的顺序按照排序树确定
		 */
//		Set<Object> ts = new TreeSet<Object>();
//		ts.add("ab");
//		ts.add("ac");
//		//ts.add(new Test());//TreeSet要求集合类的元素有可比较性
//		ts.add("bb");
//		ts.add("ba");
//		System.out.println(ts);
		
	}

}
