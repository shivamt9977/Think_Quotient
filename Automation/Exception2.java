package com.ExceptionProgram;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Start");
		
		//try catch block 
		//syntax
		
		try {
			System.out.println(100/0);
		}catch(ArithmeticException e)
		{
			System.out.println(100/5);

		}
		
		System.out.println("Main Ends");
	}

}
