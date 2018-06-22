package thread;
public class TicketRunnable implements Runnable{

	private int tickets = 50;
	
	public void run() {
		while(true){
			if(tickets>0){
				System.out.println(Thread.currentThread().getName()+
						" is saling ticket "+tickets);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				tickets--;
			}
			else{
				break;
			}
		}
	}
	
	public int getTickets(){
		return tickets;
	}

}
