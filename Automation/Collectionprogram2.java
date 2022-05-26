package com.CollectionProgram;

import java.util.ArrayList;
import java.util.List;

public class Collectionprogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List lst=new ArrayList();//upcasting
		lst.add(7654);
		lst.add("sgsgs");
		lst.add(889.98);
		System.out.println(lst.size());
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}

}
