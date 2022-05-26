package com.CollectionProgram;

import java.util.ArrayList;
import java.util.List;

public class BookPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> lst=new ArrayList<Book>();
		Book b1=new Book("david","Testing",234.65);
		Book b2=new Book("major","loop",648.35);
		
		lst.add(b1);
		lst.add(b2);
		
		for(Book b:lst)
		{
			System.out.println("Author:-"+b.author+",title:-"+b.title+",price:-"+b.price);
		}
	}

}

class Book
{
	String author;
	String title;
	double price;

	
public Book(String author,String title,double price)
{
	this.author=author;
	this.title=title;
	this.price=price;
}

}