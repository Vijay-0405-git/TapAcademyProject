package com.Package.TCS;

public class binarySearch {
	
	public static int bSearch(int[] arr,int tar) {
		int s=0;
		int e= arr.length-1;
		while(s<e) {
			int mid=(s+e)/2;
			if(arr[mid]==tar) {
				return mid;
			}
			if(arr[mid]>tar) {
				e=mid-1;
			}
			if(arr[mid]<tar) {
				s=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int tar=4;
		System.out.println(bSearch(arr, tar));

	}

}
