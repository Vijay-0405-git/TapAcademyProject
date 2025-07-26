package com.Package.DataStructuresandAlgorithms;

import java.util.Scanner;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(kadanes(arr));
		sc.close();
 
	}

	public static int kadanes(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length==0) {
			return 0;
		}
		int maxcur=0;
		int maxglo=0;
		for(int i=0;i<arr.length;i++) {
			maxcur=Math.max(arr[i], arr[i]+maxcur);
			if(maxcur>maxglo) {
				maxglo=maxcur;
			}
			
		}
		return maxglo;
	}

}
