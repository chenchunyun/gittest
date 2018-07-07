package ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		File src = new File("e:/temp/file1.txt");
		BufferedReader br = null;

		File desc = new File("e:/temp/desc.txt");
		BufferedWriter bw = null;
		try {
			if (desc.exists()) {
				desc.delete();
			}
			if (!desc.exists()) {
				desc.createNewFile();
			}
			br = new BufferedReader(new FileReader(src));
			bw = new BufferedWriter(new FileWriter(desc));
			String  str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				bw.write(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

// File src = new File("e:/temp/file1.txt");
// BufferedInputStream bis = null;
//
// File desc = new File("e:/temp/desc.txt");
// BufferedOutputStream bos = null;
// try {
// if (!desc.exists()) {
// desc.createNewFile();
// }
// bis = new BufferedInputStream(new FileInputStream(src));
// bos = new BufferedOutputStream(new FileOutputStream(desc));
// int c = -1;
// while ((c = bis.read()) != -1) {
// System.out.println(c);
// bos.write(c);
// }
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// } finally {
// try {
// bos.close();
// bis.close();
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
