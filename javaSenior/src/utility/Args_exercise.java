package utility;


public class Args_exercise {

	public static void sayHello(String name) {
		System.out.println("Hello "+name+"!");
	String string = "abcdefg";
	System.out.println(string);
	}

	public static void main(String args[]) {
        sayHello(args[0]);
        sayHello(args[1]);
        sayHello(args[2]);
	}

}
