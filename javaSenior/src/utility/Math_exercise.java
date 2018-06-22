package utility;

public class Math_exercise {
	public static void main(String args[]) {
		double r;
		for (int i = 0; i < 5; i++) {
			r = Math.random();//0<=r<1.0 
			r = r*100;//0<r<100  95.678	
			  //int rNum = (int)(Math.random());
			//int rNum = (int) Math.round(r);
			int rNum = (int)Math.ceil(r);
			//int rNum = (int)Math.floor(r);
			System.out.print(r + "  ");
		}
	}

}
