package com.Tap.package1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			t=t+ch;
		}
		System.out.println(t);
	  	
	   
	}
}

	