package io;

import java.io.*;

public class FileCopy {
	public static void main(String args[]){
		File f1 = new File("d:/io/a.doc");
		File f2 = new File("d:/io/b.doc");
		FileInputStream fr = null;
		FileOutputStream fw = null;
		
		try {
			fr = new FileInputStream(f1);
			fw = new FileOutputStream(f2);
			
			byte[] cbuf = new byte[fr.available()];
			fr.read(cbuf);
			fw.write(cbuf);	
			System.out.println("文件复制成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
	}

}
