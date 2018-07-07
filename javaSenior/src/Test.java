import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =new ArrayList<String>();
		list.add("apple");
		list.add("grape");
		list.add("pear");
		list.add("banana");
		Collections.sort(list,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) {
					return 1;
				}else if(o1.length() < o2.length()){
					return -1;
				}
				return 0;
			}
		});;
		
		System.out.println("最小数是"+list.get(0));
		System.out.println("最大数是"+list.get(list.size()-1));
		for(Object o:list){
			System.out.println(o);
		}
	}

}
