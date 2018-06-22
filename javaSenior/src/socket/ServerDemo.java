package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		try{
			Socket s = ss.accept();
			System.out.println("有客户端连接，ip："+s.getInetAddress().getHostAddress());
		    BufferedReader in = new BufferedReader(
		    		            new InputStreamReader(
		    		            s.getInputStream()));
		    PrintWriter out = new PrintWriter(
		    		          new OutputStreamWriter(s.getOutputStream()),true);
		    while(true){
		    	String str = in.readLine();
		    	if(str.equals("exit")){
		    		break;
		    	}
		    	System.out.println("接收客户端数据："+str);
		    	System.out.println("服务器端：");
		    	Scanner sc = new Scanner(System.in);
		    	String serStr = sc.nextLine();
		    	out.println(serStr);
		    }
		    System.out.println("服务器退出");
		}
		finally{
			ss.close();
		}

	}

}
