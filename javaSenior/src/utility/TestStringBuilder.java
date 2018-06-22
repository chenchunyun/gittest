package utility;

public class TestStringBuilder {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		System.out.println(sb);
		sb.insert(sb.length(), 'g');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
