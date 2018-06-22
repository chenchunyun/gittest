package io;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	String id;
	String name;
	String birth;
	
	public Student(String id,String name,String birth){
		this.id = id;
		this.name = name;
		this.birth = birth;
	}
	
	public String toString(){
		return "id="+id+" name="+name+" birth="+birth;
	}

}
