package utility;

public class Citizen{
	private int id;
	private String name;
	
	public Citizen(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public Citizen(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o){	
			Citizen c = (Citizen)o;
			if(c.id == this.id){
				return true;
			}	
			else{
				return false;
			}
		}
	
	
	public static void main(String args[]){
		Citizen xiaoming = new Citizen(21000,"xiaoming");
		Citizen mingming = new Citizen(21000,"mingming");
		System.out.println(xiaoming.equals(mingming));
		
		
	}

}
