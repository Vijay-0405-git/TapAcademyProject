package com.Tap.package1;

import java.util.Scanner;

public class PrimeNumber {
	 static boolean isPrime(int n) {
		 if(n<2) {
			 return false;
		 }
		 for(int i=2;i*i<=n;i++) {
			 if(n%i==0) {
				 return false;
			 }
		 }
		 return true;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(isPrime(a));
		sc.close();

	}

}
