package com.automation;

public class Practicemethod {
	static int a = 10;
	static int b = 20;
	static int c;

	static void getsalary() {
		
		c = b - a;
		System.out.println(c);
	}

	int getmoney() {
		c = a + b;
		return c;
	}
public static void main(String[] args) {
	Practicemethod obj =new Practicemethod();
	System.out.println(obj.getmoney());//
	Practicemethod.getsalary();
	
	
}
}
