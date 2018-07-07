package ch01.pack;


public class PackDemo {
	final static Integer integer = 1;
	public static void main(String[] args) {
		int a = 666;
		Integer ia = a ;
		Integer ib = a;
		System.out.println(integer);
		
		System.out.println(ia.equals(ib));//包装类请使用equals方法比较
		String input = " 89.757";
		input = input.trim();
		Double ic = Double.parseDouble(input);//parseXXXX
		Double id = Double.valueOf(input);//valueOf
		System.out.println(ic+"\t"+id);
		Double  d1 = 3.18;
		String s1 = Double.toString(d1);//使用包装类的toString方法把包装类数值改变为字符串对象
		System.out.println(s1);
		
	}

}
