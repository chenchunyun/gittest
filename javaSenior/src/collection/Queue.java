package collection;

import java.util.LinkedList;

public class Queue extends LinkedList{

	
//入队
	public void put(Object o) {
		this.addLast(o);
	}
//出队
	public Object get() {
		Object o = this.getFirst();
		this.removeFirst();
		return o;
		
	
	}

	public boolean isEmpty() {
		int s = this.size();
		if (s <= 0)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		Queue qq = new Queue();

		qq.put("one");
		qq.put("two");
		qq.put("three");
		qq.put("four");
		
		System.out.println(qq);
		System.out.println(qq.get());
		System.out.println(qq.get());
		System.out.println(qq.isEmpty());
	}
}
