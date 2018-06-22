package utility;

public class StrBuf {
    
	public StringBuffer invert(String s){
		StringBuffer sb = new StringBuffer(s);

	    int loc = sb.length()-3;
		while(loc>0){
			sb.insert(loc,',');
			loc = loc-3;
		}
		
		return sb;
	}
	
	
	public static void main(String[] args) {
		StrBuf s = new StrBuf();
		System.out.println(s.invert("15429"));
		

	}

}
