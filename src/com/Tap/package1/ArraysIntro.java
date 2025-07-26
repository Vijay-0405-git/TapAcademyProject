

package com.Tap.package1;
import java.util.Scanner;


public class ArraysIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int factors=0;
		System.out.println("Enter the number");
		int num=sc.nextInt();	
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				factors++;
			}
			
		}
	if(factors==2) {
		System.out.println("Prime Number");
	}
	else {
		System.out.println("Not a prime Number");
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
