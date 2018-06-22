package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExercise {
	public static void main(String args[]){
		Student s1 = new Student("A001","Lucy","1986-06-06");
		Student s2 = new Student("A002","Lily","1988-08-08");
		
		try {
			FileOutputStream fos = new FileOutputStream("d:\\io\\student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			System.out.println("对象序列化...");
			oos.writeObject(s1);
			oos.writeObject(s2);
			
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e2) {
			System.out.println(e2.getMessage());
		}
		
		try {
			FileInputStream fis = new FileInputStream("d:\\io\\seri_exer.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			System.out.println("反序列化...");
			Student ss1 = (Student)ois.readObject();
			Student ss2 = (Student)ois.readObject();
			
			System.out.println(ss1);
			System.out.println(ss2);
			
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
