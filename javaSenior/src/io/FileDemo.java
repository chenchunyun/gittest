package io;

import java.io.*;

public class FileDemo {
	public static void main(String args[]) {

		/*
		 * 创建一个File对象实际上表示的就是路径
		 * 并非一定要有存在的文件
		 */
		File f = new File("d:/io/1.txt");
		//File f2 = new File("1.txt");//此处采用的是File(URI uri)的构造方法
			
		if (f.exists()){
			f.delete();
			System.out.println("文件删除成功");
		}
			
		else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
            
			System.out.println("文件名是：" + f.getName());
			System.out.println("文件的路径是：" + f.getPath());// 相对路径
			System.out.println("文件的绝对路径是：" + f.getAbsolutePath());// 绝对路径
			System.out.println(f.canRead() ? "文件是可读的" : "文件是不可读的");
			System.out.println(f.canWrite() ? "文件是可写的" : "文件是不可写的");
		}
		
	}

}
