package com.Tap.package1;
class Grandparent{
	int a=12;
	
	
}
class parent extends Grandparent{
	public void readbooks() {
		System.out.println("I love to read books");
	}
	
}
class parent1 extends Grandparent{
	public void play() {
		System.out.println("I love to play");
	}
}
class child1 extends parent{
	void eat() {
		System.out.println("I love to eat");
	}
	
}

class child2 extends parent{
	
}

public class Inheritance {
	public static void main(String[] args) {
		child1 c1=new child1();
		System.out.println(c1.a);
		c1.readbooks();
		c1.eat();
	}
}
