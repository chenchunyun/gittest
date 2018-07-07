package ch03;

import java.io.Serializable;

public class Emp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3233137287637593787L;
	/**
	 * 20180703 22:20 0001
	 */
	private Integer empNo;
	private transient String eName;
	public Emp() {
		super();
	}
	public Emp(Integer empNo, String eName) {
		super();
		this.empNo = empNo;
		this.eName = eName;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", eName=" + eName + "]";
	}
	

}
