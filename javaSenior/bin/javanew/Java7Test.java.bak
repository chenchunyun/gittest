package javanew;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java7Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.数值常量对下划线支持
		int billon = 1_000_000_000; // 10^9
		long creditCardNumber = 1234_4567_8901_2345L; // 16 digit number
		long ssn = 777_99_8888L;
		double pi = 3.1415_9265;
		float pif = 3.14_15_92_65f;

		// 以下是错误的写法
		// double pi = 3._1415_9265; // 小数点后不能添加下划线
		// long creditcardNum = 1234_4567_8901_2345_L; // 数字结尾不能添加下划线
		// long ssn = _777_99_8888L; // 数值开头不能添加下划线

		// 2.声明二进制常量
		int mask = 0b01010000101;
		// 结合下划线，这样写更好
		int binary = 0B0101_0000_1010_0010_1101_0000_1010_0010;

		// 3.switch对String的支持
		String state = "NEW";
		switch (state) {
		case "NEW":
			System.out.println("Order is in NEW state");
			break;
		case "CANCELED":
			System.out.println("Order is Cancelled");
			break;
		case "REPLACE":
			System.out.println("Order is replaced successfully");
			break;
		default:
			System.out.println("Invalid");
		}

		// 4.catch表达式调整
		try {
			if (true)
				throw new ClassNotFoundException();
			else
				throw new SQLException();

		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}

		// 5.“<>”类型推断运算符
		Map<String, List<String>> employeeRecords = new HashMap<>();
		List<Integer> primes = new ArrayList<>();

		// 6.自动资源管理
		try (BufferedReader reader = new BufferedReader(new FileReader(
				"C:/a.txt"));) {
			// ...
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
