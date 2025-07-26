package com.Tap.package1;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyMapping {

	public static void main(String[] args) {
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char i='a';i<='z';i++) {
			hm.put(i, 0);
		}
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            }
			
		}
		for(char k:hm.keySet()) {
			if(hm.get(k)>0) {
				System.out.println(k+"-->"+hm.get(k));
			}
		}

	}

}
