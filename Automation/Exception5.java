package com.ExceptionProgram;

import javax.naming.InsufficientResourcesException;

public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(amounttransfer(5687,3754));
		} catch (InsufficientResourcesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int amounttransfer(int bal,int amt) throws InsufficientResourcesException{
		
		int Restamount;
		if(amt>bal)
		{
			throw new InsufficientResourcesException();
		}
		else
		{
			Restamount=bal-amt;
		}
		return Restamount;
	}
}
