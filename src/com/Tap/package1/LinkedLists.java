package com.Tap.package1;
import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.toString());
		list.addLast(23);
		System.out.println(list.toString());
		list.addFirst(34);
		System.out.println(list.toString());
		list.removeFirst();
		System.out.println(list.toString());
		
		
	

	}

}
