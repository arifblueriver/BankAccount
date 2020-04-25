package com.overloading;

public class Student {
	
	void getsalary(String name) {
		System.out.println(name);
	}
	void getsalary(String name,int age) {
		System.out.println(name);
		System.out.println(age);
	}
	
	void getsalary(String name,int age,String address) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		
	}

}
