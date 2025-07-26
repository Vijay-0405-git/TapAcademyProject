package com.Tap.package1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<2*n+1;j++) {
				if(i==j ||(i+j)==2*n) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}		
				
			}
			System.out.println();
		}

	}

}
