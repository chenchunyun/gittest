package ch01.equa;


public class User {
	private String id;
	private String name;
	public User() {
		super();
	}
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	/**
	 * 重写equals 判断身份证号相同，名字相同就是同一个用户
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof User && this.id.equals(((User) obj).id) && this.name.equals(((User) obj).name)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		User scott = new User("420111********5511","scott");
		User scottn = new User("420111********5511","scott");
		System.out.println(scott.equals(scottn));//false??//重写equals后true
		int i = 0;
		double d = 0.0;
		System.out.println(i == d);//true
		
	}
}
