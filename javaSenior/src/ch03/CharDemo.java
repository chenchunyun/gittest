package ch03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class CharDemo {

	public static void main(String[] args) {
		File file1 = new File("e:/temp/file1.txt");
		Writer os = null;
		try {
			if (!file1.exists()) {
				file1.createNewFile();
			}
			os = new FileWriter(file1,true);
			os.write("abc");
			char [] chars = {'a','b','c'};
			os.write(chars,0,2);
		
			
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				os.flush();
				os.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		Reader os = null;
//		try {
//			if (!file1.exists()) {
//				file1.createNewFile();
//			}
//			os = new FileReader(file1);
//			int i = -1;
//			while ((i = os.read()) != -1) {
//				System.out.println((char)i);
//			}
//			
//			
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}



	}

}
