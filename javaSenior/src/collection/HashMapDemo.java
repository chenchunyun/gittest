package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String args[]) {
		HashMap hm = new HashMap();

		hm.put("tom", 20);
		hm.put("john", 21);
		hm.put("jack", 20);
		hm.put("jones", 19);
		hm.put("rose", 19);
		hm.put("sun", 23);
	
		hm.put("tom",25);

		// 直接通过key值来取值
		String name = "tom";
		
		int age = (Integer) hm.get("tom");
		System.out.println(name + "的年龄是" + age);
		System.out.println();

		// 通过Iterator迭代出key值，再通过key值取出内容
		Set keys = hm.keySet();
		//获得key的集合
		Iterator it = keys.iterator();
		//遍历key的集合，取得每个key值
		while(it.hasNext()){
		String key = (String)it.next();		
		System.out.println(key+":");
			//通过每个key值，找到value
		int age1 = (Integer)hm.get(key);
		System.out.println(age1);
		}	
	}
}
