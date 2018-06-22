package thread;

public class TestTicket {

	public static void main(String[] args) {
		//使用Runnable
		TicketRunnable runner = new TicketRunnable();
		
		Thread t1 = new Thread(runner);
		Thread t2 = new Thread(runner);
		Thread t3 = new Thread(runner);
		
		t1.start();
		t2.start();
		t3.start();
		
		//使用Thread
		/*
		TicketThread t1 = new TicketThread();
		TicketThread t2 = new TicketThread();
		TicketThread t3 = new TicketThread();
		
		t1.start();
		t2.start();
		t3.start();
		*/

	}

}
