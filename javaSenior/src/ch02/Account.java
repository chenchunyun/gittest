package ch02;

public class Account {
	private Integer id;
	private String name;
	private Integer balance;

	public Account() {
		super();
	}

	public Account(Integer id, String name, Integer balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Account) {
			return (this.id).equals(((Account)obj).id);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

}
