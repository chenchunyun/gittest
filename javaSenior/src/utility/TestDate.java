package utility;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		//获取当前系统时间
		Date now = new Date();
		System.out.println(now);
		
		//比较日期
		Date d1 = new Date(1000);
		//System.out.println(d1);
		System.out.println(now.after(d1));
		System.out.println(now.before(d1));
		System.out.println(now.compareTo(d1));

	}

}
