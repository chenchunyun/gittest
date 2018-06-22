package thread;

public class TicketSynMethod implements Runnable{

	private int num = 50;
	
	public synchronized void saleTicket() {
		
			if(num>0){
				System.out.println(Thread.currentThread().getName()+
				" No."+num+" ticket is saled");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				num--;
			}
			System.out.println("OK");
  }
	
	
	

	public void run() {
		while(true){
			if(num>0){
				this.saleTicket();
			}
			else{
				break;
			}
		}
		
	}

}
