package ch03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveObject {

	public static void main(String[] args) {
		File otxt = new File("e:/temp/otxt.txt");
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			if (!otxt.exists()) {
				otxt.createNewFile();
			}
			//oos = new ObjectOutputStream(new FileOutputStream(otxt));
			ois = new ObjectInputStream(new FileInputStream(otxt));
			Emp e1 = (Emp) ois.readObject();
			//oos.writeObject(e1);
			System.out.println(e1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
