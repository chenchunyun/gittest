package com.zplm.pojo;

import java.util.Date;

/**
 * 雇员类
 * 
 * @author Administrator
 *
 */
public class EMP {
	//成员属性
	private Integer empNo;
	private String eName;
	private Date hireDate;
	private Double sal;
	private Integer deptNo;

	//构造方法：至少有一个无参的构造方法
	public EMP() {
	}

	public EMP(Integer empNo, String eName, Date date, Double sal, Integer deptNo) {
		this.empNo = empNo;
		this.eName = eName;
		this.hireDate = date;
		this.sal = sal;
		this.deptNo = deptNo;
	}

	//getter setter方法
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

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	//显示所有属性的toString方法
	@Override
	public String toString() {
		return "EMP [empNo=" + empNo + ", eName=" + eName + ", hireDate=" + hireDate + ", sal=" + sal + ", deptNo="
				+ deptNo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		EMP tEmp = new EMP();
		if(obj instanceof EMP) {
			tEmp = (EMP)obj;
		}
		return this.getEmpNo() == tEmp.getEmpNo();
	}
	
}
