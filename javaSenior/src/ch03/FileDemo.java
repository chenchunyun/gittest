package ch03;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File dir = new File("e:/temp");
		if(!dir.exists()) {
			dir.mkdir();
		}
		File file1 = new  File("e:/temp/test1.txt");
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File file2 = new File("abc.txt");
		if(!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File file3 = new File("e:/temp","file3.txt");
		if(!file3.exists()) {
			file3.createNewFile();
		}
		File filet = new File("e:/temp");

		File file4 = new File(filet, "file4.txt");
		if(!file4.exists()) {
			file4.createNewFile();
		}
		File tempFile = File.createTempFile("filetemp1", ".txt",dir);
		System.out.println(tempFile.getPath());
		
		System.out.println(file3.equals(file4));
		System.out.println(file3.canRead());
		System.out.println(file3.canWrite());
		System.out.println(Arrays.toString(dir.list()));
		System.out.println(file3.getAbsolutePath());
		System.out.println(file3.getPath());
		System.out.println(file3.getName());
		System.out.println(file3.getParent());
		
		

				

	}

}
