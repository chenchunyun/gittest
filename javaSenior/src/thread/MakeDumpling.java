package thread;

public class MakeDumpling implements Runnable{

	public void run() {
		System.out.println("饺子：和面");
		System.out.println("饺子：和馅");
		for(int i=0;i<30;i++){
		System.out.println("饺子：擀饺子皮");
		System.out.println("饺子：包饺子");
		}
		System.out.println("饺子：煮饺子");		
	}

}
