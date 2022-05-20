package com.ArrayPrograms;

import java.util.Arrays;

public class ArrayProgram5 {

	public static void main(String[] args) {
		int[] arr= {2,5,7,10,14,18,23,27,35,39,45,57,67,78};//sorted array
		//int i=Arrays.binarySearch(arr, 45);
		
		int i = Binarysearchforele(arr,98);
		System.out.println(i);
		
		
	}

	private static int Binarysearchforele(int[] arr, int ele) {

		int f=0;
		int l=arr.length-1;
		while(f<l)
		{
			int m=(f+l)/2;
			if(arr[m]==ele)
			{
				return m;
			}
			else if(arr[m]>ele)
			{
				l=m-1;
			}
			else if(arr[m]<ele)
			{
				f=m+1;
			}
		}
		return -1;
	}
	

}
