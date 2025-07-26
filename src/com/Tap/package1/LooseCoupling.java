package com.Tap.package1;

class parent11 {
	public void eat() {
		System.out.println("Eating from parent class");
	}
	public void drink() {
		System.out.println("Drinking");
	}
}

class child extends parent11{
	@Override
	public void drink() {
		System.out.println("Child drinks more than parent");
	}
	public void drive() {
		System.out.println("Driving in child class");
	}
}

public class LooseCoupling {

	public static void main(String[] args) {
		parent11 ref;
		child c=new child();
		ref=c;//Polymorphism
		ref.drink();
		c.eat();
		((child)(ref)).drive();//Down Casting

	}

}
