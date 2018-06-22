package utility;

public class StringBuf {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println(sb);
		sb.insert(sb.length(), 'g');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
