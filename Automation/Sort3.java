package com.arrayprogram;

public class Sort3 {

	public static void main(String[] args) {

		int[] arr= {2,5,56,1,45,34,76,98,45,67,37,78,43};
		
		sortanarray(arr);
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

	private static void sortanarray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
