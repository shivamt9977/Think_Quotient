package com.stringprogram;

public class reverseword {
	
	public static void main(String[] args)
	{
		String s="java is very easy Langauge";
		String[] s1=s.split(" ");
		String rev=" ";
		for(String s2:s1)
		{
			//System.out.println(s2);
			int n=s2.length()-1;
			for(int i=n;i>=0;i--)
			{
				rev=rev+s2.charAt(i);
			}
		}
		System.out.println(rev);
	
	}

}
