package io;

import java.io.*;
import java.net.*;

public class ClientDemo {
	public static void main(String args[]){
		try {
			Socket cs = new Socket(InetAddress.getLocalHost(),1234);
			OutputStream os = cs.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			Customer c1 = new Customer("xiaowanzi",9,"hualun",20.0);
			oos.writeObject(c1);
			
			oos.flush();
			oos.close();
			
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
