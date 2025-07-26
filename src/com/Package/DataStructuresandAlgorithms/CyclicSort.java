package com.Package.DataStructuresandAlgorithms;

public class CyclicSort {
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
		int[] arr= {5,1,2,4,3,6,9,8,7};
		
		cyclicSort(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");		
		}

	}

}
