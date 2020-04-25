package com.sobhanbhai;

class Parents{
	
	void getproperty() {
		System.out.println("I want my property");
	}
	int getmoney(){
		return 2000;
	}
}

public class Child extends Parents {
	public static void main(String[] args) {
		Parents obj = new Parents();
		obj.getproperty();
		obj.getmoney();
		System.out.println(obj.getmoney());
	}

}