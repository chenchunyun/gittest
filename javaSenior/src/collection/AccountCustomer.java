package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;

public class AccountCustomer {
	public static void main(String args[]) {
		Map<String, Set<String>> ac = new HashMap<String, Set<String>>();

		Set<String> cus1 = new HashSet<String>();

		cus1.add("SY000005");
		cus1.add("SY000015");
		ac.put("210103198802022273", cus1);

		Set<String> cus2 = new HashSet<String>();
		cus2.add("DL000123");
		cus2.add("DL000321");
		ac.put("210103196802022284", cus2);

		Set<String> cus3 = new HashSet<String>();
		cus3.add("SH000012");
		ac.put("205103196802022284", cus3);

		// Iterator<Entry<String, Set<String>>> it = ac.entrySet().iterator();
		// while (it.hasNext()) {
		// Entry<String, Set<String>> entry = it.next();
		// System.out.println(""+ entry.getKey());
		// Set<String> accountSet = entry.getValue();
		// Iterator<String> setIt = accountSet.iterator();
		// while (setIt.hasNext()) {
		// String string = (String) setIt.next();
		// System.out.println("**** "+string);
		// }
		// }

		Iterator<String> it = ac.keySet().iterator();
		while (it.hasNext()) {
			String customer = (String) it.next();
			HashSet<String> account = (HashSet<String>) ac.get(customer);
			System.out.print("身份号码是" + customer + "的用户的帐户:");
			Iterator<String> it2 = account.iterator();
			while (it2.hasNext()) {
				String num = (String) it2.next();
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
