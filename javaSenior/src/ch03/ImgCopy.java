package ch03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgCopy {

	public static void main(String[] args) {
		File src = new File("e:/temp/src.jpg");
		DataInputStream dis = null;
		File desc = new File("e:/temp/desc.jpg");
		DataOutputStream dos = null;
		try {
			if (!desc.exists()) {
				desc.createNewFile();
			}
			dis = new DataInputStream(new FileInputStream(src));
			dos = new DataOutputStream(new FileOutputStream(desc));
			int i = -1;
			while ((i = dis.read()) != -1) {
				dos.write(i);
			}
			System.out.println("Ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.flush();
				dos.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
