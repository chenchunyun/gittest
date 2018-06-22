package thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowDate implements Runnable {
	int count = 0;

	public void run() {
		while (true) {
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = sdf.format(now);
			System.out.println(time);
			count++;
			if(count>10){
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
