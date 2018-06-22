package utility;

public class StringDemo {
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = new String("abc");
		String s4 = "abc";
		
		System.out.println(s1.equals(s2));//t
		System.out.println(s1.equals(s4));//t
		System.out.println(s2.equals(s3));//t
		
		
		
	}
}
