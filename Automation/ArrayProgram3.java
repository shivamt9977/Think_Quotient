package com.arrayprogram;


public class ArrayProgram3 {

	public static void main(String[] args) {

		//Book name program
		
		Book[] b1=new Book[4];
		b1[0]=new Book("Testing");
		b1[1]=new Book("java");
		b1[2]=new Book(".net");
		b1[3]=new Book("data Science");
		for(Book b:b1)
		{
			System.out.println(b);
		}
	}

}
class Book{
	String title;
	public Book(String title) {
		this.title=title;
	}
	
	public String toString()
	{
		return "Title: "+title;
	}
}
