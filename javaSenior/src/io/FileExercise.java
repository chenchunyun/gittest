package io;

import java.io.*;

public class FileExercise {
	public static void main(String args[]) {
		File f = new File("D:/io");
		if (!f.exists())
			System.out.println("该文件不存在");
		else {
			System.out.println("路径是" + f.getAbsolutePath() + "的文件夹内的文件有：");

			//String dir[] = f.list();
			File fl[] = f.listFiles();
			
			for (int i = 0; i < fl.length; i++) {
				//System.out.println("文件名:" + dir[i]);
				 System.out.println("文件名："+fl[i].getName());
				System.out.println("路径名：" + fl[i].getPath());
				System.out.println("-------------");
			}

		}
	}

}
