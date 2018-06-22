package collection;

import java.util.*;

public class EnhanceFor {
	public static void main(String args[]){
		//遍历集合中的每一个元素
		List<Integer> li = new ArrayList<Integer>();
		
		for(int i=0;i<5;i++){
			li.add(i);
		}
		for(Integer num:li){
			System.out.println(num);
		}
	
		/*
		for(Iterator<Integer> it=li.iterator();it.hasNext();){
			Integer num = (Integer)it.next();
			System.out.println(num);
		}
		*/
		
		//遍历数组中的每个元素
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i] = i+5;
		}
		for(int n:arr){
			System.out.println(n);
		}
		/*
		for(int i=0;i<arr.length;i++){
			int n = arr[i];
			System.out.println(n);
		}
		*/
		
	
	}

}
