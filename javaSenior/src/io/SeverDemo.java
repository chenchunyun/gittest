package io;

import java.net.*;
import java.io.*;

public class SeverDemo {
	public static void main(String args[]){
		ServerSocket ser = null;
		Socket soc = null;
		Customer c1 = null;

		
		try {
			ser = new ServerSocket(1234);
			System.out.println("准备接收来自Client的信息...");
			soc = ser.accept();
			InputStream in = soc.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(in);
			
			c1 = (Customer)ois.readObject();
			System.out.println(c1);
			
			ois.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
