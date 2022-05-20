package com.arrayprogram;

public class ArrayProgram2 {

	public static void main(String[] args) {

		String[] s=new String[4];
		s[0]="C++";
		s[1]="java";
		s[2]="Testing";
		s[3]="Python";
		//System.out.println(s);
		
		for(String s1:s)
		{
			System.out.println(s1);
			System.out.println(s1.length());

		}

	}

}
