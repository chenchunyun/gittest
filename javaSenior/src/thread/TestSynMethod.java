package thread;

public class TestSynMethod {

	public static void main(String[] args) {
		TicketSynMethod t = new TicketSynMethod();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
