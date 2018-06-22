package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRW {
	public static void main(String args[]) {
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			FileReader fr = new FileReader("d:/io/brw_src.txt");
			br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("d:/io/brw_des.txt");
			bw = new BufferedWriter(fw);
            
			// 在首位对字符进行标记
			br.mark(1);
			// 读一个字符

			System.out.println((char) br.read());

			// 读一行字符
			System.out.println(br.readLine());

			/*
			 * 复制文件
			 */
			// 再从文件头开始读
			br.reset();
			String str;
			while ((str = br.readLine()) != null) {
				bw.write(str);
				// bw.newLine();
			}
			bw.flush();

			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("文件复制成功");
	}

}
