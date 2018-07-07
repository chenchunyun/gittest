package com.zplm.test;

import java.util.Calendar;

import com.zplm.pojo.EMP;

public class TestPOJO {
	public static void main(String[] args) {
		EMP e1 = new EMP(1001, "scott", Calendar.getInstance().getTime(), 800.00, 20);
		System.out.println(e1.toString());
	}

}
