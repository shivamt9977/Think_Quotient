package com.CollectionProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>lst=new ArrayList<String>();
		lst.add("shivam");
		lst.add("car");
		lst.add("Bike");
		 Iterator<String> itr=lst.iterator();
		 while(itr.hasNext())
		 {
			 String s=itr.next();
			 System.out.println(s);
			 itr.remove();

		 }
		 System.out.println(lst.isEmpty());

	}

}
