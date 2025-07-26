package com.Tap.package1;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=102;
		if(marks > 90  && marks <=100) {
			System.out.println("A+ grade");
		}
		else if(marks >80 && marks<=90) {
			System.out.println("A grade");
		}
		else if (marks >70 && marks <=80) {
			System.out.println("B+ grade");
		}
		else if (marks >60 && marks <=70) {
			System.out.println("B grade");
		}
		else if(marks >50 && marks <=35) {
			System.out.println("C grade");
		}
		else if(marks<35 && marks<=0) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Marks");
		}
	}

}
