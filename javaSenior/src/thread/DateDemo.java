package thread;

public class DateDemo {

	public static void main(String[] args) {
		ShowDate date = new ShowDate();
		Thread t = new Thread(date);
		t.start();
		
		
		
	}

}
