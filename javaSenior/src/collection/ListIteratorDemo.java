package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String args[]){
		
		ArrayList li = new ArrayList();
		for(int i=1;i<6;i++){
			li.add(new Integer(i));
		}
		
		ListIterator  lit = li.listIterator();
		
		/*在1和2之间插入6*/
		System.out.println(lit.nextIndex());
		lit.next();
		lit.add(new Integer(6));
		System.out.println(li);
		
		/*删除6*/
		lit.previous();
		lit.remove();
		System.out.println(li);
		
		/*将元素3替换成字符’A‘*/
		lit.next();
		lit.next();
		lit.set(new Character('A'));
		System.out.println(li);
			
	}

}
