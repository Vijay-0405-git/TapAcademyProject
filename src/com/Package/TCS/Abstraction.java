package com.Package.TCS;

interface application{
	public void start();
	default void end() {
		System.out.println("End of the application");
	}
	
}
class team implements application{
	public void start(){
		System.out.println("We started the project");
		
	}
}

public class Abstraction {

	public static void main(String[] args) {
		team t=new team();
		t.start();
		t.end();
		

	}

}
