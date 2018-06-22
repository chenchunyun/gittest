package collection;

import java.util.ArrayList;

public class GenericDemo3 {
	public static double getAverage(ArrayList<? extends Number> list) {
		double total = 0.0;
		for (Number number : list)
			total += number.doubleValue();
		return total / list.size();
	}

	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(100);
		integerList.add(200);
		System.out.println(integerList);
		//integerList.add(300);
		System.out.println(getAverage(integerList));
		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(10.0);
		doubleList.add(20.0);
		System.out.println(getAverage(doubleList));
		ArrayList<String> StringList = new ArrayList<String>();
		//System.out.println(getAverage(StringList)); 
	}
}

