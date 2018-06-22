package utility;

public class TestWrapper {
	public static void main(String ars[]){
		Object[] o = new Object[3];
		Integer ii = new Integer(5);
		int jj = ii.intValue();
		//自动拆箱、自动封箱
		Integer aa = 9;
		int bb = aa;
		
		
		Integer i = new Integer(5);
		Integer j = new Integer(5);
		System.out.print(i.equals(j));
		
		
		/*包装类型变量与基本数据类型之间的转换*/
		
		//1.基本数据类型 —— 包装类型
		Double obj_d = new Double(3.14);
		
		//2.包装类型 —— 基本数据类型
		double d = obj_d.doubleValue();
		
		//3.字符串 —— 包装类型
		Integer obj_i = new Integer("5");
		
		//4.字符串 —— 基本数据类型
		double n = Double.parseDouble("5");
		
		//5.基本数据类型 —— 字符串
		String s = Integer.toString(888);
		
		

	}

}
