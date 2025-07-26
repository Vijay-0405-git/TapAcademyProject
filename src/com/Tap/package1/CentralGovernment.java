package com.Tap.package1;


import java.util.Scanner;
Collections

class UnderAgeException extends Exception{
	@Override
	public String getMessage() {
		return "Age is Invalid";
	}
	
}

class UpperAgeException extends Exception{
	@Override
	public String getMessage() {
		return "Age is above the limit";
	}
	
}

class RTO{
	int age=18;
	int da;
	void acceptInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		da=sc.nextInt();
		
	}
	void verify() throws UnderAgeException, UpperAgeException{
		if(da>=age && da<=65) {
			System.out.println("License Issued");
		}
		else if(da<18) {
			UnderAgeException iae=new UnderAgeException();
			System.out.println(iae.getMessage());
			throw iae;
		}
		else {
			UpperAgeException ipe=new UpperAgeException();
			System.out.println(ipe.getMessage());
			throw ipe;
		}
	}
}
class StateGovernment{
	
	void initiate(){
		RTO r=new RTO();
		try {
			r.acceptInput();
			r.verify();
		}
		catch(Exception e){
			try {
				r.acceptInput();
				r.verify();
			}
			catch(Exception f) {
				try {
					r.acceptInput();
					r.verify();
				}
				catch (UnderAgeException un) {
					System.out.println("Your age is below the Limit!!");
				}
				catch(UpperAgeException up) {
					System.out.println("Your age is above the Limit!!Please contact nearest RTO and submit your Fitness Certificate");
				}
			}
		}
	}	
}
public class CentralGovernment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateGovernment s=new StateGovernment();
		s.initiate();

	}

}
