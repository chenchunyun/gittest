package thread;

public class TestDeadLock {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		DeadLockThread_1 t1 = new DeadLockThread_1(obj1,obj2);
		DeadLockThread_2 t2 = new DeadLockThread_2(obj1,obj2);
		
		t1.start();
		t2.start();
		
	}

}
