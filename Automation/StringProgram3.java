package com.stringprogram;

public class StringProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s="java developer";
		
		System.out.println(getcount(s,'e'));
		System.out.println(getcount(s,'d'));
		System.out.println(getcount(s,'a'));

	}
	
	public static int getcount(String s,char c) {
		return s.length()-s.replace(c+"","").length();
	}
	

}
