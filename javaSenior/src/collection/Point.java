package collection;

public class Point<E> {	
	private  E x;
	private  E y;



	public Point(E x1, E y1) {
		x = x1;
		y = y1;
	}

	public E getX() {
		return x;
	}

	public E getY() {
		return y;
	}

	public void setX(E x1) {
		x = x1;
	}

	public void setY(E y1) {
		y = y1;
	}

	public static void main(String args[]) {
		Point<Integer> point1 = new Point<Integer>(4, 2);
		point1.setX(new Integer(5));
		Integer a = point1.getX();
		System.out.println(a);
		
		Point<Double> point2 = new Point<Double>(1.3, 2.6);
		point2.setX(new Double(6.0));
		Double b = point2.getX();
		System.out.println(b);
	}
}
