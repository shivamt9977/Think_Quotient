package com.ExceptionProgram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try (FileReader f = new FileReader("")) {
			} catch (FileNotFoundException e) {
				throw e;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
