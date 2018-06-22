package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String args[]) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			Customer c1 = new Customer("Dingdang", 10, "kangfu", 200.0);
			Customer c2 = new Customer("Kenan", 7, "xiaonan", 2000.0);

			fos = new FileOutputStream("d:/io/customer.txt");
			oos = new ObjectOutputStream(fos);

			System.out.println("对象序列化...");

			oos.writeObject(c1);
			oos.writeObject(c2);

			oos.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("d:/io/customer.txt");
			ois = new ObjectInputStream(fis);

			System.out.println("对象反序列化...");
			Object c = null;
			while ((c = ois.readObject()) != null) {
				Customer c1 = (Customer) c;
				System.out.println(c1.age + " " + c1.name + " " + c1.password);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
		catch(EOFException e){
			System.out.println("读取完毕");
		} 
		catch (IOException e2) {
			e2.printStackTrace();
		} 		
		catch (ClassNotFoundException e3) {
			e3.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
