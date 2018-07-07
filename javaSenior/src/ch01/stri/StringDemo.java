package ch01.stri;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str1 = "helloWorld";
		System.out.println((char)(str1.charAt(0)-32)+str1.substring(1));
		//str1.substring(1);//从索引1开始截取字符串
		//(char)(str1.charAt(0)-32);把字符串首字符变为大写
		char [] value = new char[10];
		value[0] = (char) (str1.charAt(0)-32);
		for (int i = 1; i < str1.length(); i++) {
				value[i] = str1.charAt(i);
		}
		str1 = new String(value);
		System.out.println(str1);
		
//		System.out.println(str1.toUpperCase());//变为大写
//		System.out.println(str1.toLowerCase());//变为小写
		
		
		
	}

}
