package ch02;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		/***
		 * HashSet 不允许存放重复的对象，存入顺序与存储的顺序是不一样的，无序
		 *         按照hashCode来存储
		 */
		Set<Object> hs = new HashSet<>();
		EMP e1 = new EMP(1001, "SCOTT", new Date(), 800.00, 10);
		hs.add(e1);
		
		EMP e2 = new EMP(1001, "SCOTT", new Date(), 800.00, 10);
		hs.add(e2);
		System.out.println(e1.equals(e2));
//		hs.add("ab");
//		hs.add("ac");
//		hs.add("bx");
//		hs.add("bc");
		System.out.println(hs.toString());
//		Set<Object> hsz = new HashSet<>();
//		hsz.add("中国");
//		hsz.add("北京");
//		hsz.add("武汉");
//		System.out.println(hs.contains("ab"));//true包含某个对象吗？返回true或false
//		System.out.println(hs.size());//集合的尺寸长度
		//hs.remove("ab");//删除集合中的某个对象
		//hs.clear();//清楚所有集合对象元素
//		System.out.println(hs.isEmpty());//判断集合是否为空
//		hs.addAll(hsz);//在集合中添加另一个集合
//		//hs.removeAll(hsz);//在集合中删除一个子集合
//		hs.retainAll(hsz);//让hs集合只保留hsz集合 ，移除其他所有的内容
//		System.out.println(hs);
		
		
		
		/***
		 * TreeSet 不允许存放重复的对象，存入的顺序和存储的顺序不一样的，无序
		 *         存储的顺序按照排序树确定
		 */
//		Set<Object> ts = new TreeSet<>();
//		ts.add("ab");
//		ts.add("ac");
//		//ts.add(new Test());//TreeSet要求集合类的元素有可比较性
//		ts.add("bb");
//		ts.add("ba");
//		System.out.println(ts);
		
	}

}
