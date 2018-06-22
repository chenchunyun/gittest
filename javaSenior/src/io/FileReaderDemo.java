package io;

import java.io.*;

public class FileReaderDemo {
	public static void main(String args[]){
		File f = new File("d:/io/b.txt");
		FileReader fr = null;
		try {		
			fr = new FileReader(f);
			int c;
			while((c=fr.read())!=-1){
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("要读取的文件不存在");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("读取错误");
			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
