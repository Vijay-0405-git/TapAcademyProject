package com.Tap.package1;

import java.util.Scanner;

class businessman{
	private int principal;
	static float rate;
	private int time;
	private float si;
	void values() {
		System.out.println(principal);
		System.out.println(rate);
		System.out.println(time);
		System.out.println(si);
		
		
	}
	static {
		rate=15.2f;
	}
	public void takeInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal Amount");
		this.principal=sc.nextInt();
		
		System.out.println("Enter the time duration");
		this.time=sc.nextInt();
		//sc.close();
		
	}
	public void calcInt() {
		this.si=principal*rate*time/100;
	}
	void dis() {
		System.out.println(si);
	}
	
	
}

public class APRIL4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		businessman b1=new businessman();
		b1.values();
		b1.takeInput();
		b1.calcInt();
		b1.dis();
		
		businessman b2=new businessman();
		b1.values();
		b2.takeInput();
		b2.calcInt();
		b2.dis();
		
		
		

	}
	

}
