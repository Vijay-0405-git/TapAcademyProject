package com.Package.DataStructuresandAlgorithms;

public class InsertionSort {
	
	
	public static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int[] arr= {5,1,2,4,3,5,2};
		insertionSort(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");		
		}
		

}
}
