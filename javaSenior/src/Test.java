import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
		String s = "aaaaaaaaaa";
		String a = "abc";

		int num = 0;// i是循環的次數

		for (int i = 0; i <= s.length() - a.length(); i = s.indexOf(a, i) + 1) {
			if (s.indexOf(a, i) != -1) {
				System.out.println(i);
				num++;
				System.out.println("******" + num);
			} else {
				break;
			}
		}
		System.out.println(num);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS E a");
		Calendar calendar = Calendar.getInstance();
		System.out.println("北京时间：" + sdf.format(calendar.getTime()));
		Long long1 = calendar.getTimeInMillis() - 1000 * 60 * 60 * 7;
		calendar.setTimeInMillis(long1);
		System.out.println("巴黎时间：" + sdf.format(calendar.getTime()));
		Date d1 = calendar.getTime();

		// System.out.println(sdf.format(d1));
		// String string = sdf.format(d1);
		// Date date = sdf.parse(string);
		// System.out.println(date);

		// 月份和星期？？？
		// System.out.println(calendar.get(Calendar.YEAR)+"年"
		// +(calendar.get(Calendar.MONTH)+1)+"月"
		// +calendar.get(Calendar.DATE)+"日"
		// +calendar.get(Calendar.HOUR_OF_DAY)+"时"
		// +calendar.get(Calendar.MINUTE)+"分"
		// +calendar.get(Calendar.SECOND)+"秒"
		// +calendar.get(Calendar.MILLISECOND)+"毫秒"+"星期"
		// +(calendar.get(Calendar.DAY_OF_WEEK)-1)+"");
		//

		// for (int i = 0; i < 100; i++) {
		// double d1 = Math.random();// 0.0---1.0之间，包含0.0不包含1.0
		// int r1 = (int) (99 * d1);
		// System.out.println(r1);//随机生成一个从0开始不大于10的数据
		// if(r1>=99 || r1<0) {
		// System.err.println("********************");
		// }
		//
		// }

		// System.out.println(Math.min(56, 66)+"\n"
		// +Math.abs(-666)+"\n"
		// +Math.floor(0.157)+"\n"
		// +Math.ceil(0.157)+"\n"
		// +Math.round(5.4));

		// String str1 = new String("abc");
		// String str2 = new String("abc");
		// String str3 = "abc";
		// System.out.println(str1 == str2);
		// System.out.println(str2 == str3);
		// System.out.println(str1.equals(str2));
		// System.out.println(str2.equals(str3));
		// System.out.println(str1.hashCode() + "\t" + str2.hashCode() + "\t" +
		// str3.hashCode());
		// System.out.println(str1.toString() + "\t" + str2.toString() + "\t" +
		// str3.toString());
		// String s1 = "abc";
		// String s2 = s1;
		// System.out.println("给s1赋值abc\n 给s2赋值s1");
		// System.out.println("*******此时s1 s2的值为：" + s1 + "\t" + s2);
		// s1 = "ABC";
		// System.out.println("改变s1的值为ABC后");
		// System.out.println("*******s1 s2的值为：" + s1 + "\t" + s2);

	}

}
