package ch02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Long, Set<String>> hp = new HashMap<Long,Set<String>>();
		
		Long id1 = 420111000000005581L;//省份证号
		Set<String> ac1 = new HashSet<String>(); //银行卡号
		ac1.add("YJ10000001");
		ac1.add("YJ10000002");
		
		Long id2 = 420122000000005582L;//省份证号
		Set<String> ac2 = new HashSet<String>(); //银行卡号
		ac1.add("EJ10000022");
		ac1.add("EJ10000023");
		
		hp.put(id1, ac1);

		
	}

}
