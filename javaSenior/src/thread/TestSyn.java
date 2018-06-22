package thread;

public class TestSyn {

	public static void main(String[] args) {
		//使用Runnable
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
