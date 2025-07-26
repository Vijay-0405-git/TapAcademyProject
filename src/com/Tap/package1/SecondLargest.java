package com.Tap.package1;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,6,7,9,1,11,2,6};
		int max1=0;
		int max2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
		}
		System.out.println(max2);

	}

}
