package com.Package.TCS;
class Dog{
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class Encapsulation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		
		d.setAge(12);
		d.setName("JOONO");
		
		System.out.println("Age of dog: "+d.getAge());
		System.out.println("Name of dog: "+d.getName());
		
		

	}

}
