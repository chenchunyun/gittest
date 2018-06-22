package io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class FileWriterDemo2 {
	public static void main(String args[]){
		FileWriter fout = null;
		try {
			fout = new FileWriter("d:\\io\\d.txt",true);
			char[] b = {'a','中','国'};
			fout.write(b);
			fout.close();
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e2) {
			System.out.println(e2.getMessage());
		}
		System.out.println("文件写入成功");
		
	}

}
