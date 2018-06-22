package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	public static void main(String args[]) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			// 写一个文件
			fos = new FileOutputStream("d:/io/ds.txt");
			dos = new DataOutputStream(fos);

			dos.writeInt(100);
			dos.writeDouble(200.5);
			dos.writeUTF("中国");
			dos.writeBoolean(false);

			dos.flush();
			dos.close();
			fos.close();

			// 读一个文件
			FileInputStream fis = new FileInputStream("d:/io/ds.txt");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println(dis.readBoolean());

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (dos != null) {
					dos.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
