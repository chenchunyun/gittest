package utility;

import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		//获取Calendar类的实例
		Calendar c = Calendar.getInstance();
	    //System.out.println(c);
		System.out.println(c.get(Calendar.YEAR)+"年"+
				           (c.get(Calendar.MONTH)+1)+"月"+
				           c.get(Calendar.DAY_OF_MONTH)+"日");
		
		//设置指定时间
		c.set(2011,10,11);
		System.out.println(c.get(Calendar.YEAR)+"年"+
		           (c.get(Calendar.MONTH)+1)+"月"+
		           c.get(Calendar.DAY_OF_MONTH)+"日");
	}

}
