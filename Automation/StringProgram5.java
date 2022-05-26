package com.stringprogram;

public class StringProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Madam";
		System.out.println(isPallindrome(s));
		System.out.println(isPallindrome("Mam"));

	}
	
	public static boolean isPallindrome(String s)
	{
		s=s.toLowerCase();//madam
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				return false;
			}
		}
		return true;
	}

	

}
