package thread;

public class MakePeanuts implements Runnable{

	public void run() {
		System.out.println("花生：锅内倒油");
		System.out.println("花生：放入花生");
		for(int i=0;i<30;i++){
		System.out.println("花生：不断翻炒");
		}
		System.out.println("花生：盛出花生");
		
		
	}

}
