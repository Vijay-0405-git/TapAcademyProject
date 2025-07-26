package com.Tap.package1;
class Student{
	private int sId;
	private String sName;
	private int sNum;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsNum() {
		return sNum;
	}
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	
	
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		
		//System.out.println(a);
		s.setsId(100);
		s.setsName("Vijay");
		s.setsNum(10987);
		System.out.println(s.getsName());
		System.out.println( s.getsId());
		System.out.println(s.getsNum());
		
	   
	    
		

	}

}
