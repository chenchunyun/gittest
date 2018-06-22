package io;

import java.io.*;

public class FileInputStreamDemo2 {
	public static void main(String args[]) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("d:/io/b.txt");
			byte[] b = new byte[fin.available()];
			fin.read(b);
			for (int i = 0; i < b.length; i++) {
				System.out.print((char) b[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("找不到指定文件");
		} catch (IOException e) {
			System.out.println("读取文件有误");
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				System.out.println("关闭文件时出错");
			}
		}

	}

}
