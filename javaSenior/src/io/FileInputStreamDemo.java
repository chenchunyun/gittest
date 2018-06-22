package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String args[]) {
		//FileInputStream fis = null;
		// 创建一个File的实例对象，该文件对象的路径是d:\\io\\a.txt
		// File f = new File("d:\\io\\a.txt");
		/*
		 * 实例化一个FileInputStrem对象，用来读取外部文件 捕获FileNotFound异常
		 */
		try {
			//FileInputStream fis = new FileInputStream("d:\\io\\a.txt");
			 File f = new File("d:\\io\\a.txt");
			 FileInputStream fis = new FileInputStream(f);
			
			// 使用read()方法，读取一个字节的内容
			System.out.print((char)fis.read()+"\n");

			
			// 使用read()方法，读取文件中的全部内容
			int c = 0;
			while ((c = fis.read()) != -1) {
				System.out.print((char)c);
			}
			System.out.print('\n');
           
			
			
			// 使用read(byte[] b)方法
			byte b[] = new byte[fis.available()];
			fis.read(b);
			int j = 0;
			while (j < b.length) {
				System.out.print((char)b[j]);
				j++;
			}
          
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		/*
		finally{
			fis.close();
		}
        */

	}
}