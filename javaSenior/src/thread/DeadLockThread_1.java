package thread;

public class DeadLockThread_1 extends Thread {
	private Object obj1;
	private Object obj2;
	
	public DeadLockThread_1(Object obj1,Object obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void run(){
		synchronized(obj1){
			System.out.println("�߳�1�Ѿ�����obj1�������ڵȴ�obj2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (obj2) {
				System.out.println("�߳�1�Ѿ�����obj2�����������");
			}
		}
	}

}
