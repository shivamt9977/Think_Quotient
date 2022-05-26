package com.CollectionProgram;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collectionprogram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst=new ArrayList();
		System.out.println(lst.isEmpty());
		lst.add(7654);
		lst.add("sgsgs");
		lst.add(889.98);
		lst.add("Toy");
		System.out.println(lst.isEmpty());
		
		Iterator itr=(Iterator) lst.iterator();
		while(((java.util.Iterator) itr).hasNext())
		{
			 itr.next();
		}
	}

}
