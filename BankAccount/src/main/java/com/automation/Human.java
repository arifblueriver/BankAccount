package com.automation;

// call method static word than classname.methodname();
// no static method creat obj than obj.method name

public class Human {
	
	void getsalary() {
		
		Human girl =new Human();
		int age =6;
		String sex="F";
		double salary = 5000.75;
		
		System.out.println(age);
		System.out.println(sex);
		System.out.println(salary);
		
	}
	
	public static void main(String[] args) {
		
		Human obj= new Human();
		
		obj.getsalary();
	
		
		
	}

}
