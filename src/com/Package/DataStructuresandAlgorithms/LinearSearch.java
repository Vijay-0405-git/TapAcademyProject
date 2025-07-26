package com.Package.DataStructuresandAlgorithms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8};
		int tar=987654;
		System.out.println(LinearSearching(arr, tar));

	}
	static int LinearSearching(int[] arr,int tar) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==tar) {
				return i;
			}
		}
		return -1;
	}

}
