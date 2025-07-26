package com.Tap.package1;

public class MainLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list=new LL();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		list.insertFirst(34);
		list.display();
		list.insertAt(0,36);
		list.display();
		list.deleteLast();
		
		list.display();
	}

}
