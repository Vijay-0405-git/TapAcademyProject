package com.Tap.package1;

import java.util.Scanner;
import java.util.Stack;

public class ValidPranthesis {
	
	public static boolean isValid(String s) {
		Stack<Character> stack=new Stack<>();
		for(char ch:s.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
				
			}
			else if(ch>='a' && ch<='z') {
				continue;
			}
			else {
				char top=stack.pop();
				if(ch=='}' && top!='{') return false;
				if(ch==')' && top!='(') return false;
				if(ch==']' && top!='[') return false;
			}
			
		}
		return stack.isEmpty();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the paranthesis");
		String s =sc.nextLine();
		if(isValid(s)) {
			System.out.println("The paranthesis are valid");
			
		}
		else {
			System.out.println("The paranthesis are invalid");
		}
		sc.close();

	}

}
