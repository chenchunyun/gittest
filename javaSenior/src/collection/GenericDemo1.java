package collection;

import java.util.ArrayList;

public class GenericDemo1 {
	public static double getSum(ArrayList<? extends Number> list){
		double sum = 0;
		for(Number n:list){			
			sum += n.intValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>(); 
		a.add(3);
		a.add(5);
		a.add(7);
		
		System.out.println(getSum(a));

	}

}
