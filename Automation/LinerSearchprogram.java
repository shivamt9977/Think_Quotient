package com.arrayprogram;

public class LinerSearchprogram {

	public static void main(String[] args) {

		int[] arr= {2,4,34,65,77,45,34,85,34,76,34,55,78};
		System.out.println(Linearsearchforelement(arr,78));
		System.out.println(Linearsearchforelement(arr,97));

	}

	private static int Linearsearchforelement(int[] arr, int ele) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				return i;
			}
		}
		return -1;
	}

}
