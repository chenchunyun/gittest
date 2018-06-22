package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class String_exercise1 {
	public static void checkEmail(String email) throws EmailCheckException {

		int len = email.length();//email的长度
		int begin = email.indexOf('@');//从开始检索，@在email中的位置
		int end = email.lastIndexOf('@'); //从结尾检索，@在email中的位置
		int dot = email.indexOf('.', begin);//检索.是否在@后存在

		//判断长度是否不超过20
		if (email.length() > 20)
			throw new EmailCheckException("Email长度不能大于20");
		//判断是否唯一包含@
		else if (begin != end)
			throw new EmailCheckException("Email中含有多个@");
		//判断@是否存在或在开头或在结尾
		else if (begin == -1 || begin == 0 || begin == (len - 1))
			throw new EmailCheckException("Email中没有@或@位置错误");
		//判断@后是否有.
		else if (dot == -1)
			throw new EmailCheckException("@后缺少域分隔符");
		//判断@是否在末尾
		else if (dot == (len - 1))
			throw new EmailCheckException("分隔符错误");
	}

	public static void main(String args[]) {

		String email = args[0];
		try {
			checkEmail(email);
		} catch (EmailCheckException e) {
			e.printStackTrace();
		}

	}

}
