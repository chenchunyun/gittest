package thread;

public class HostAParty {

	public static void main(String[] args) {
		MakeDumpling dumpling = new MakeDumpling();
		MakePeanuts peanuts = new MakePeanuts();
		
		Thread t1 = new Thread(dumpling);
		Thread t2 = new Thread(peanuts);
		
		t1.start();
		t2.start();
		
		for(int i=0;i<=30;i++){
			System.out.println("客人"+i+":请进");
		}
	}
}
