package com.Tap.package1;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			//Loop for Spaces
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
				
			
			
			System.out.println();
		}

	}

}
