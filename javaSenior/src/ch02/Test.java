package ch02;

import java.util.ArrayList;
import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		//String string = "start";
		StringBuffer sb = new StringBuffer("start");
		//StringBuilder sbn = new StringBuilder("start");
		long begin = Calendar.getInstance().getTimeInMillis();
		for (int i = 0; i < 10000000; i++) {
			//string += "loop";
			sb.append("loop");//97ms
			//sbn.append("loop");//436
			
		}
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.println(end - begin + "ms");
		
		
	}
}
