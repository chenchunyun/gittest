package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestDateFormat {
   public static void main(String[] args) {
	   //获取指定日期格式的SimpleFormat实例 1999年09月09日 12:12:12
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   
	   //获取指定日期的格式化字符串
	   String nowStr = sdf.format(new Date());
	   System.out.println(nowStr);
	   
	   //将格式化的字符串转换成日期
	   try {
		Date d = sdf.parse("2011-11-11 11:11:11");
		System.out.println(d);
	} catch (ParseException e) {
		System.out.println("输入的字符串不符合日期的格式");
		e.printStackTrace();
	}
	   
	   
   }
}
