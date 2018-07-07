package ch03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ByteDemo {
	public static void main(String[] args) throws Exception {
		File file1 = new File("e:/temp/file1.txt");
//		OutputStream os = null;
//		try {
//			if (!file1.exists()) {
//				file1.createNewFile();
//			}
//
//			os = new FileOutputStream(file1);
//			String string = "abcde";
//
//			os.write(200058964);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//				os.flush();
//				os.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		 InputStream is = new FileInputStream(file1);
		 byte[] bytes = new byte[is.available()];
		 is.read(bytes);
		 System.out.println(new String(bytes));
		 is.close();
	}
}
