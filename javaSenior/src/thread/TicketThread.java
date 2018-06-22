package thread;

public class TicketThread extends Thread {
	private int tickets = 50;
	
	public void run(){
		while(true){
			if(tickets>0){
				System.out.println(Thread.currentThread().getName()+
						" is saling ticket "+tickets--);
			}
			else{
				break;
			}
		}
	}
	
	public int getTicket(){
		return tickets;
	}

}
