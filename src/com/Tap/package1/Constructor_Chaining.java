package com.Tap.package1;
class Customer{
	private int id;
	private String name;
	
	public Customer(int a,String b) {
		id=a;
		name=b;
	}
	public Customer() {
		id=2;
		name="Jaya";
	}
	
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}

public class Constructor_Chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//normal setters are called with reference to the object.
		//Constructor works when an object is started to create.
		//Constructor doesn't have any return type.
		Customer c=new Customer(1,"Vijay");
		System.out.println(c.getId());
		System.out.println(c.getName());
		
		
		
		
		
		
		
		

	}

}
