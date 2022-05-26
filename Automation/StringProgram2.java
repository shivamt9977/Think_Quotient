package com.stringprogram;

public class StringProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count of character
		
		String s="java developer";
		
		System.out.println(getcount(s,'e'));
		

	}
	
	public static int getcount(String s,char c) {
		return s.length()-s.replace(c+"","").length();
	}

}
