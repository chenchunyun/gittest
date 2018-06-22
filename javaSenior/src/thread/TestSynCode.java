package thread;

public class TestSynCode {

	public static void main(String[] args) {
		TicketSynCode t = new TicketSynCode();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
