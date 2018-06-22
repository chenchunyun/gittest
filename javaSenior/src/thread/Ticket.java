package thread;

public class Ticket implements Runnable{

	private int num = 50;
	
	public  void saleTicket() {
		
		synchronized(this){
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
		
		}	
			System.out.println("ok");
		}
	
	
	public synchronized int getNum(){
		return num;
	}


	public void run() {
		while(true){
			if(this.getNum()>0){
				this.saleTicket();
			}
			else{
				break;
			}
		}
		
	}

}
