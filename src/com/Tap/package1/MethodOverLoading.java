package com.Tap.package1;

class Calculator{
	void add() {
		System.out.println(100+50);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,double b) {
		System.out.println(a+b);
	}
	
}

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To avoid multiple code segments although they perform a similar function we use Method Overloading.
		//Multiple methods with same name but different parameters is called "Method Overloading".
		//Compile type polymorphism.
		//One of many types is called as polymorphism.
		Calculator c1=new Calculator();
		c1.add();
		c1.add(100, 200);
		c1.add(100,500.01);
	}

}
