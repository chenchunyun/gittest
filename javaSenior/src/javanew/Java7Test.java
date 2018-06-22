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
		// 1.��ֵ�������»���֧��
		int billon = 1_000_000_000; // 10^9
		long creditCardNumber = 1234_4567_8901_2345L; // 16 digit number
		long ssn = 777_99_8888L;
		double pi = 3.1415_9265;
		float pif = 3.14_15_92_65f;

		// �����Ǵ����д��
		// double pi = 3._1415_9265; // С�����������»���
		// long creditcardNum = 1234_4567_8901_2345_L; // ���ֽ�β��������»���
		// long ssn = _777_99_8888L; // ��ֵ��ͷ��������»���

		// 2.���������Ƴ���
		int mask = 0b01010000101;
		// ����»��ߣ�����д����
		int binary = 0B0101_0000_1010_0010_1101_0000_1010_0010;

		// 3.switch��String��֧��
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

		// 4.catch���ʽ����
		try {
			if (true)
				throw new ClassNotFoundException();
			else
				throw new SQLException();

		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}

		// 5.��<>�������ƶ������
		Map<String, List<String>> employeeRecords = new HashMap<>();
		List<Integer> primes = new ArrayList<>();

		// 6.�Զ���Դ����
		try (BufferedReader reader = new BufferedReader(new FileReader(
				"C:/a.txt"));) {
			// ...
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
