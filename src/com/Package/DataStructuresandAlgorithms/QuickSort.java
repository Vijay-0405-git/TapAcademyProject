package com.Package.DataStructuresandAlgorithms;

import java.util.Arrays;

public class QuickSort {
	
	public static void quickSort(int[] arr,int s,int e) {
		if(s>e) {
			return;
		}
		int left=s;
		int right=e;
		int mid=(s+e)/2;
		int pivot=arr[mid];
		while(s<=e) {
			while(arr[s]<pivot) {
				s++;
			}
			while(arr[e]>pivot) {
				e--;
			}
			if(s<e) {
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
			}
			s++;
			e--;
		}
		quickSort(arr,left,e);
		quickSort(arr, s, right);
		
	}

	public static void main(String[] args) {
		int[] arr= {1,4,3,2,5,6,7};
		
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));



	}

}
