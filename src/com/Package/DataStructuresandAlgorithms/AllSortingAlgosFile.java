package com.Package.DataStructuresandAlgorithms;

import java.util.Arrays;

public class AllSortingAlgosFile {
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	
	
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int maxid=0;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]>arr[maxid]) {
					maxid=j;
				}
			}
			int temp=arr[maxid];
			arr[maxid]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
		}
	}
	
	
	
	public static void inserionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	
	
	
	public static void cyclicSort(int[] arr) {
		
		int i=0;
		while(i<arr.length) {
			int crt=arr[i]-1;
			if(arr[i]!=i+1) {
				int temp=arr[crt];
				arr[crt]=arr[i];
				arr[i]=temp;
			}
			i++;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr= {1,4,3,2,5,6,7};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}


