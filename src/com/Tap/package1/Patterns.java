package com.Tap.package1;

public class Patterns {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=2*n;i++) {
			for(int j=1;j<=2*n;j++) {
				if(j==1||j==2*n||i==j||i+j==2*n+1) {
					System.out.print("*");
					
				}
				else {
					System.out.print("  ");
					
				}
				
				
			}
			System.out.println();
		}

	}

}
