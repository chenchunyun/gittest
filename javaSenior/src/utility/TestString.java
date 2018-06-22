package utility;



public class TestString {

	public static void main(String[] args) {
		String s = args[0];
		int num = 0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c=='e'){
				num++;
			}
		}
		
		System.out.println("该字符串中字符e出现"+num+"次");
		
     
	}

}
