package com.Tap.package1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print("   ");
			}
			for(int j=1;j<=i;j++) {
				if(c<10) {
					System.out.print(" "+c+" ");
					c++;
				}
				else {
				
				System.out.print(c +" " );
				c++;
				}
			
			}
			System.out.println();
			
		}
	}

}
