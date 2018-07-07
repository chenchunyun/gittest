package thread;

public class DeadLockThread_1 extends Thread {
	private Object obj1;
	private Object obj2;

	public DeadLockThread_1(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {
		synchronized (obj1) {
			System.out.println("DeadLockThread_1锁定obj1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			synchronized (obj2) {
				System.out.println("DeadLockThread_1锁定obj1和obj2");
			}
		}
	}

}
