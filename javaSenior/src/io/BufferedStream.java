package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {
	public static void main(String args[]) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			FileInputStream fis = new FileInputStream("d:\\io\\a.txt");
			bis = new BufferedInputStream(fis);

			FileOutputStream fos = new FileOutputStream("d:\\io\\bs.txt");
			bos = new BufferedOutputStream(fos);
			int b;

			// read和write方法的使用
			while ((b = bis.read()) != -1) {
				char c = (char) b;
				System.out.print(c);
				bos.write(b);
			}
			bos.flush();

			/*
			  // mark和reset方法 bis.read(); bis.read(); bis.mark(0);
			 
			 for (int i = 0; i < 12 && (b = bis.read()) != -1; i++) {
			 System.out.print((char) b); }
			 
			 System.out.println(); //bis.reset(); for (int i = 0; i < 10 && (b =
			 bis.read()) != -1; i++) { System.out.print((char) b); }
			 */
			bos.close();
			bis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(-1);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
