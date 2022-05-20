package com.arrayprogram;

import java.util.Arrays;

public class SortProgram {

	public static void main(String[] args) {

		int[] arr= {2,5,56,45,34,76,98,45,67,37,78,43};
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
