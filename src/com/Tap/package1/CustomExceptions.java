package com.Tap.package1;

import java.util.Scanner;

class InvalidPinException extends Exception{
	@Override
	public String getMessage() {
		return "Invalid Pin";
	}
}

class ATM{
	int pin=1234;
	int cpin;
	
	void AcceptInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin");
		cpin=sc.nextInt();
	}
	
	void verify() throws InvalidPinException {
		if(pin==cpin) {
			System.out.println("Collect Your Money");
		}
		else {
			InvalidPinException ipe=new InvalidPinException();
			System.out.println(ipe.getMessage());
			throw ipe;
			
		}
	}
}

class Bank{
	void initiate() {
		ATM a=new ATM();
		try {
			a.AcceptInput();
			a.verify();
		}
		catch(InvalidPinException e){
			try {
				a.AcceptInput();
				a.verify();
			}
			catch(InvalidPinException f) {
				try {
					a.AcceptInput();
					a.verify();
				}
				catch(InvalidPinException g){
					System.out.println("Card Blocked!!Contact Bank");
					
				}
			}
		}
	}
}
public class CustomExceptions {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.initiate();
		
		

		
	}

}
