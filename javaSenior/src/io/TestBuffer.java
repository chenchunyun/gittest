package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffer {
	public static void main(String args[]){
		FileReader in = null;
		BufferedReader br = null;
		FileWriter out = null;
		BufferedWriter bw = null;
		try {
			in = new FileReader("d:\\io\\a.txt");
			br = new BufferedReader(in);
			
			out = new FileWriter("d:\\io\\b.txt");
			bw = new BufferedWriter(out);
			
			String s = null;
			while((s=br.readLine())!=null){
				System.out.println(s);
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
		}
		
	}

}
