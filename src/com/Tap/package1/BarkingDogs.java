package com.Tap.package1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BarkingDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ip=sc.nextLine();
		String[] arr=ip.split("[.]+");
		System.out.println(Arrays.toString(arr));
		HashSet<String> hs=new HashSet<>();
		for(String s:arr) {
			if(s!=" ") {
				hs.add(s);
			}
		}
		System.out.println(hs.size());
				

	}

}
