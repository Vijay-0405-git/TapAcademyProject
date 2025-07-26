package com.Package.DataStructuresandAlgorithms;



public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			int maxid=0;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[maxid]<arr[j]) {
					maxid=j;
				}
			}
			int temp=arr[maxid];
			arr[maxid]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
		}
		
			
	}
	
	public static void main(String[] args) {
		int[] arr= {5,1,2,4,3,2};
		selectionSort(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");		
		}
		
		
	}
}
