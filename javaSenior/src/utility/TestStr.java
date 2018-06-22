package utility;

public class TestStr {
	public static void main(String args[]){
	   
		//使用StringBuffer
		StringBuffer sbf = new StringBuffer(); 	//""
		for(int i=0;i<10;i++)
		{
			sbf.append(i);//"0123...9"
			
		}
		System.out.println(sbf);
        
        //使用String	
		String str = new String();  
		for(int i=0;i<10;i++)
		{
			str = str + i;//"0123...9"
		}
		System.out.println(str);
	}
}