package collection;

import java.util.HashSet;
import java.util.Iterator;

public class IteractorDemo {
	public static void main(String args[]) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 1; i < 6; i++) {
			set.add(new Integer(i));
		}	
        //获得游标
		Iterator<Integer> it = set.iterator();
        //循环遍历
		while(it.hasNext()){
		Integer j = (Integer)it.next();
		System.out.println(j);
		//it.remove();
		//it.remove();
		}
		
		System.out.println(set);
	}

}
