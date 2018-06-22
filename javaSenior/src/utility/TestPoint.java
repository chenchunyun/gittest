package utility;

public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(55,66);
		Point p2 = new Point(55,66);
		Point p3 = new Point(22,33);
		
		System.out.println("p1:"+p1);
		System.out.println("p2:"+p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
		System.out.println(p1.equals(p3));
	}

}
