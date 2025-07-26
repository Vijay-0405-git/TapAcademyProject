package com.Package.TCS;

class parent{
	String colour="black";
	int height=6;
	void setColour(String colour) {
		this.colour=colour;
	}
}
class child extends parent{
	
	String job="Software Engineer";
	@Override
	void setColour(String colour) {
		// TODO Auto-generated method stub
		super.setColour(colour);
	}
}




public class Inheritance {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent p=new parent();
		System.out.println(p.colour);
		child c=new child();
		c.setColour("white");
		System.out.println(c.colour);
		System.out.println(c.height);
		System.out.println(c.job);

	}

}
