package com.Package.DataStructuresandAlgorithms;

public class BinarySearchAgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8};
		System.out.println(BinarySearch(arr, 10));

	}
	static int BinarySearch(int[] arr,int tar) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]<tar) {
				start=mid+1;
			}
			else if(arr[mid]>tar) {
				end=mid-1;
			}
			else {
				return mid;
			}
			
		}
		return -1;
		
	}

}
